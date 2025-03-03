package com.example.spring_la_mia_pizzeria_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.spring_la_mia_pizzeria_crud.repository.PizzaRepository;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping("/")
    public String index(Model model) {
        if (pizzaRepository.findAll().size() == 0) {
            model.addAttribute("pizzas", pizzaRepository.findAll());
            model.addAttribute("isValid", "false");
        } else {
            model.addAttribute("pizzas", pizzaRepository.findAll());
            model.addAttribute("isValid", "true");
        }
        ;
        return "index";
    }

    @GetMapping("/contatti")
    public String contatti(Model model) {
        return "contatti";
    }
}
