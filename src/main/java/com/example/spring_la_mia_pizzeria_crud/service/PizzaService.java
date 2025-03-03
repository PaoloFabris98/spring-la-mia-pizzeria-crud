package com.example.spring_la_mia_pizzeria_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_la_mia_pizzeria_crud.model.Pizza;
import com.example.spring_la_mia_pizzeria_crud.repository.PizzaRepository;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }

    public Optional<Pizza> findById(int id) {
        return pizzaRepository.findById(id);
    }

    public List<Pizza> findByNomeContaining(String nome) {
        return pizzaRepository.findByNomeContaining(nome);
    }

    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public void deleteById(int id) {
        pizzaRepository.deleteById(id);
    }
}
