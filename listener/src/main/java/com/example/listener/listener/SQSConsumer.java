package com.example.listener.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class SQSConsumer {

    @SqsListener("${cloud.aws.queue.name}")
    public void receiveMessage(Map<String, Object> message) {
        log.info("SQS Message Received : {}", message);
    }
}
