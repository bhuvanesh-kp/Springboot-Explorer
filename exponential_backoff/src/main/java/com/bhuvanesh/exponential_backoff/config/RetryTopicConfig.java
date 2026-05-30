package com.bhuvanesh.exponential_backoff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.retrytopic.RetryTopicConfiguration;
import org.springframework.kafka.retrytopic.RetryTopicConfigurationBuilder;

import java.util.List;

@Configuration
public class RetryTopicConfig {
    @Bean
    public RetryTopicConfiguration myRetryTopic(KafkaTemplate<String, Object> template){
        return RetryTopicConfigurationBuilder
                .newInstance()
                .exponentialBackoff(1000, 2, 5000)
                .maxAttempts(5)
                .concurrency(1)
                .includeTopics(List.of("my-topic", "my-other-topic"))
                .create(template);
    }
}
