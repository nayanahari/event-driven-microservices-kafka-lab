package com.microservices.api_gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class ProxyController {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String ORDER_SERVICE_URL = "http://localhost:8081/orders";

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody String order) {
        return restTemplate.postForEntity(ORDER_SERVICE_URL, order, String.class);
    }

    @GetMapping
    public ResponseEntity<String> getOrders() {
        return restTemplate.getForEntity(ORDER_SERVICE_URL, String.class);
    }
}
