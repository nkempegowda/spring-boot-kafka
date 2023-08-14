package com.kempaiah.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.service.dto.EmployeeDTO;
import com.kempaiah.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @PostMapping
  public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
    EmployeeDTO savedEmployeeDTO = employeeService.saveEmployee(employeeDTO);
    return ResponseEntity.ok(savedEmployeeDTO);
  }


  @GetMapping("{id}")
  public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Long id) throws Exception {
    EmployeeDTO employeeDTO = employeeService.getEmployee(id);
    return ResponseEntity.ok(employeeDTO);
  }
}
