package com.example.lab2_2.controllers;

import com.example.lab2_2.entity.Integrantes;
import com.example.lab2_2.entity.Proveedores;
import com.example.lab2_2.repository.ProveedoresRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ProveedoresController {

    final ProveedoresRepository proveedoresRepository;

    public ProveedoresController(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }


    @GetMapping("/listar")
    public String listar(Model model) {

        model.addAttribute("listaProveedores", proveedoresRepository.findAll());
        return "vista_proveedores";
    }

    @GetMapping("/nuevo")
    public String nuevo() {
        return "proveedores/nuevoForm";
    }

    @PostMapping("/guardar")
    public String guardar(Proveedores proveedor) {
        proveedoresRepository.save(proveedor);
        System.out.println(proveedor.getIdProveedores());

        return "redirect:/vista_proveedores";
    }
}
