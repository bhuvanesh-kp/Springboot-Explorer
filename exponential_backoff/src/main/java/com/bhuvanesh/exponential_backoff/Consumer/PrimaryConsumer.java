package com.bhuvanesh.exponential_backoff.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;

public class PrimaryConsumer {
    @RetryableTopic(kafkaTemplate = "myCustomRetryTemplateUser")
    @KafkaListener(
            topics = "default_1",
            groupId = "cg_1_c_1"
    )
    public void processMessage(String message){
        // perform some actions here
        System.out.println(message);
    }
}
