package com.springboot.activemq.configuration;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@Configuration
@EnableJms
public class JmsConfig {

    @Value("${activemq.queue.name}")
    private String queueName;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(queueName);
    }
}
