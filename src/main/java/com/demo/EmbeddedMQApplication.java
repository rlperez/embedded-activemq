package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmbeddedMQApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EmbeddedMQApplication.class, args);
    }
}
