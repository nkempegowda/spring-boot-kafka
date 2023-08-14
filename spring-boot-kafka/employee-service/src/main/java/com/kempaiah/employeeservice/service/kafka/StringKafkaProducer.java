package com.kempaiah.employeeservice.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StringKafkaProducer {

  private static final Logger LOGGER = LoggerFactory.getLogger(StringKafkaProducer.class);
  @Autowired
  private KafkaTemplate<String,String> kafkaTemplate;


  public void sendMessage(String message)
  {
    LOGGER.info(String.format("message sent %s", message));
    kafkaTemplate.send("sriganesha", message);
  }
}
