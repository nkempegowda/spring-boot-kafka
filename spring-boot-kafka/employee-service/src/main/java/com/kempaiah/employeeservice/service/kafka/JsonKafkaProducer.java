package com.kempaiah.employeeservice.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.common.service.dto.EmployeeDTO;

@Service
public class JsonKafkaProducer {
  private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

  @Autowired
  private KafkaTemplate<String, EmployeeDTO> kafkaJsonTemplate;

  public void sendMessage(EmployeeDTO message)
  {
    LOGGER.info(String.format("Message sent %s", message.toString()));
    Message<EmployeeDTO> employeeDTOMessage = MessageBuilder.withPayload(message).setHeader(
        KafkaHeaders.TOPIC,"sriganesha"
    ).build();
    kafkaJsonTemplate.send(employeeDTOMessage);
  }
}
