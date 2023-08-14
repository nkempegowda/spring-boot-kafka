package com.kempaiah.employeeservice.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.common.service.dto.EmployeeDTO;

@Service
public class JsonKafkaConsumer {
  private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

  @KafkaListener(topics = "jsonTopic", groupId = "myGroup")
 // public void consumeMessage(String message)
  public void consumeMessage(EmployeeDTO message)
  {
    LOGGER.info("Message Received."+ message.toString());
  }
}
