package com.mdymen.kafkaschemaregistry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
//import com.mdymen.kafkaschemaregistry.User;

@Service
public class KafkaAvroProducer {

    @Value("${application.topic.from:normal-topic}")
    private String normalTopic;

    @Autowired
    private KafkaTemplate<String, UserTest> kafkaTemplate;

    public void send(UserTest userTest) {
        kafkaTemplate.send(normalTopic, UUID.randomUUID().toString(), userTest);
    }
}
