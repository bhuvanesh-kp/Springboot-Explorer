package com.bhuvanesh.exponential_backoff.Consumer;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;

@RetryableTopic(kafkaTemplate = "myCustomRetryTemplateUser")
@KafkaListener(topics = "default_2", groupId = "cg_2_c_class")
public class ClassLevelListener {
    @KafkaHandler
    public void handleClassLevelMessage(String message) {
        // custom message processor and handler logic goes here
        System.out.println(message);
    }
}
