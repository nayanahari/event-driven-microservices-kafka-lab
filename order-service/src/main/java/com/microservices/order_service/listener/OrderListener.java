package com.microservices.billing_service.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    @KafkaListener(topics = "order-topic", groupId = "billing-group")
    public void consumeOrder(String order) {
        System.out.println("Billing Service - Order Received: " + order);
        // Add billing logic here
    }
}