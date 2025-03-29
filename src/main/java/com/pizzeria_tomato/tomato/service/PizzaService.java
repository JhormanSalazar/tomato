package com.pizzeria_tomato.tomato.service;

import com.pizzeria_tomato.tomato.persistence.entities.PizzaEntity;
import com.pizzeria_tomato.tomato.persistence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaEntity> getAll(){
        return this.pizzaRepository.findAll();
    }

    public PizzaEntity getPizza(Integer idPizza){
        return this.pizzaRepository.findById(idPizza).orElse(null);
    }

    public PizzaEntity save(PizzaEntity pizza){
        return this.pizzaRepository.save(pizza);
    }

    public void delete(Integer idPizza){
        this.pizzaRepository.deleteById(idPizza);
    }

    public Boolean exists(Integer idPizza){
        return this.pizzaRepository.existsById(idPizza);
    }
}
