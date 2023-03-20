package com.food.ordering.consumer;

import lombok.Data;
import lombok.Value;

/**
 * @author Ikechi Ucheagwu
 * @created 19/03/2023 - 15:26
 * @project kafka-microservice
 */

@Data
@Value
public class FoodOrderDto {
    String item;
    Double amount;
}
