package com.microservices.inventory_service.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    @KafkaListener(topics = "order-topic", groupId = "inventory-group")
    public void consumeOrder(String order) {
        System.out.println("Inventory Service - Order Received: " + order);
        // Add inventory update logic here
    }
}