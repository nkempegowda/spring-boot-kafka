package com.kempaiah.employeeservice.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.common.service.dto.EmployeeDTO;

@Service
public class StringKafkaConsumer {
  private static final Logger LOGGER = LoggerFactory.getLogger(StringKafkaConsumer.class);

  @KafkaListener(topics = "stringTopic", groupId = "myGroup")
 // public void consumeMessage(String message)
  public void consumeMessage(String message)
  {
    LOGGER.info("Message Received."+ message.toString());
  }
}
