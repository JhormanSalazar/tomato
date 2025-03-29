package com.pizzeria_tomato.tomato.persistence.repository;

import com.pizzeria_tomato.tomato.persistence.entities.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
