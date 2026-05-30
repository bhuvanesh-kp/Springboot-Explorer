package com.bhuvanesh.exponential_backoff.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.DltHandler;

@Configuration
public class DLTConfig {
    @DltHandler
    public void handleDltMessage(String message) {
        // here the poison messages are handled or message which are not been able to handle on time is sent
        System.out.println(message);
    }
}
