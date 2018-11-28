package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {
    private final OrderSender orderSender;

    @Autowired
    public Controller(OrderSender orderSender) {
        this.orderSender = orderSender;
    }

    @PostMapping(value = "/activemq")
    public Mono<Void> activemq(@RequestBody Order myMessage) {
        orderSender.send(myMessage);
        return Mono.empty();
    }
}
