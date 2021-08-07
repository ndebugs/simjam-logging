package com.ndebugs.simjam.logging.services;

import com.ndebugs.simjam.logging.configurations.KafkaTopicConfiguration;
import com.ndebugs.simjam.messaging.TransactionMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    
    @KafkaListener(
            topics = KafkaTopicConfiguration.TRANSACTION_TOPIC,
            groupId = KafkaTopicConfiguration.TRANSACTION_TOPIC + "-1",
            containerFactory = "containerFactory")
    public void onReceive(TransactionMessage message) {
        //TODO: Save to DB
    }
}
