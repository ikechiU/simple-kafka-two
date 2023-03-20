package com.food.ordering.consumer;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ikechi Ucheagwu
 * @created 19/03/2023 - 15:11
 * @project kafka-microservice
 */

@Configuration
public class Config {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
