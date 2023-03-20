package com.food.ordering.producer;

import lombok.Data;
import lombok.Value;

/**
 * @author Ikechi Ucheagwu
 * @created 19/03/2023 - 14:50
 * @project kafka-microservice
 */

@Data
@Value
public class FoodOrder {
    String item;
    Double amount;
}
