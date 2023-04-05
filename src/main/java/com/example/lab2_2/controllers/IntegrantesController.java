package com.example.lab2_2.controllers;

import com.example.lab2_2.entity.Integrantes;
import com.example.lab2_2.repository.IntegrantesRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class IntegrantesController {

    final IntegrantesRepository integrantesRepository;


    public IntegrantesController(IntegrantesRepository integrantesRepository) {
        this.integrantesRepository = integrantesRepository;
    }


    @GetMapping("/listar")
    public String listar(Model model) {

        model.addAttribute("lista", integrantesRepository.findAll());
        return "vista_integrantes";
    }

    @GetMapping("/nuevo")
    public String nuevo() {
        return "integrantes/nuevoForm";
    }

    @PostMapping("/guardar")
    public String guardar(Integrantes integrante) {
        integrantesRepository.save(integrante);
        System.out.println(integrante.getIdIntegrantes());

        return "redirect:/vista_integrantes";
    }
}
