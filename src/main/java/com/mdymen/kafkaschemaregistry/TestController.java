package com.mdymen.kafkaschemaregistry;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {

    private final KafkaAvroProducer kafkaAvroProducer;

    @RequestMapping(value = "/v1/test", method = RequestMethod.POST)
    public void test(@RequestBody UserTest userTest) {
        kafkaAvroProducer.send(userTest);
    }

}
