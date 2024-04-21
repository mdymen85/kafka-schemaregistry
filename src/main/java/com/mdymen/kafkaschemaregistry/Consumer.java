package com.mdymen.kafkaschemaregistry;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Consumer {

    private static int TIME_SECONDS = 0;
    private static int DESIRED_SECONDS = 2;

    @Value("${application.topic.consumer:normal-topic}")
    private String normalTopic;

    /**
     * Will receive an event and will retry 10 times and, until
     * the first message won't end retrying, the second message won't start
     * processing.
     * @param consumerRecord
     * @throws Exception
     */
    @KafkaListener(topics = "${application.topic.from:normal-topic}", groupId = "listener")
    public void consumer(ConsumerRecord<String, UserTest> consumerRecord) throws Exception {
        log.info("Reading message {} from topic {}.", consumerRecord, normalTopic);

        log.info("consumer record {}", consumerRecord);
    }

}