package com.food.ordering.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ikechi Ucheagwu
 * @created 19/03/2023 - 07:08
 * @project Simple-Kafka-Project
 */


@SpringBootApplication
public class ProducerMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerMicroserviceApplication.class, args);
    }
}
