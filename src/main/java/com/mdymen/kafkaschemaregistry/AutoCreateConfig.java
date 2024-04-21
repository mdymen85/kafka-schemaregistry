package com.mdymen.kafkaschemaregistry;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;

import java.util.Map;

@Configuration
public class AutoCreateConfig {

    @Value("${application.topic.from:normal-topic}")
    private String normalTopic;

    @Bean
    public NewTopic compactTopicExample() {
        return TopicBuilder.name(normalTopic)
                .partitions(3)
                .replicas(1)
                .build();
    }

}