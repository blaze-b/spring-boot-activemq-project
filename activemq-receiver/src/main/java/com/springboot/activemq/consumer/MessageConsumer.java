package com.springboot.activemq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class MessageConsumer {

    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Value("${activemq.queue.name}")
    private String queueName;


    @JmsListener(destination = "${activemq.queue.name}")
    public void listener(String message) {
        logger.info("Message received {} ", message);
    }
}
