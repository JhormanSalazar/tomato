package com.pizzeria_tomato.tomato.persistence.repository;

import com.pizzeria_tomato.tomato.persistence.entities.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {

}
