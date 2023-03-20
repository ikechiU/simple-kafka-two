package com.food.ordering.consumer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ikechi Ucheagwu
 * @created 19/03/2023 - 15:34
 * @project kafka-microservice
 */

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
}
