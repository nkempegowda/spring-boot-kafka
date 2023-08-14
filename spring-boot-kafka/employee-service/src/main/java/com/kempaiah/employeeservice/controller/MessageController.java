package com.kempaiah.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.common.service.dto.EmployeeDTO;
import com.kempaiah.employeeservice.service.kafka.JsonKafkaProducer;
import com.kempaiah.employeeservice.service.kafka.StringKafkaProducer;

@RestController
@RequestMapping("api/kafka")
public class MessageController {


  @Autowired
  private StringKafkaProducer stringKafkaProducer;


  @Autowired
  private JsonKafkaProducer jsonKafkaProducer;


  @GetMapping("publish")
  public ResponseEntity<String> publish(@RequestParam("message") String message)
  {
    stringKafkaProducer.sendMessage(message);
    return ResponseEntity.ok("Message Published");
  }

  @PostMapping("publish")
  public ResponseEntity<String> publish(@RequestBody EmployeeDTO message)
  {
    jsonKafkaProducer.sendMessage(message);
    return ResponseEntity.ok("JSON Message Published");
  }



}
