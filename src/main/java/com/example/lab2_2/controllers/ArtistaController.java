package com.example.lab2_2.controllers;


import com.example.lab2_2.entity.Artista;
import com.example.lab2_2.repository.ArtistaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/artista")
public class ArtistaController {

    final ArtistaRepository artistaRepository;

    public ArtistaController(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    @GetMapping("/listar")
    public String listarArtistas(Model model){
        List<Artista> list = artistaRepository.findAll();
        model.addAttribute("listaArtitas",list);
        return "artista/vista_artistas";
    }

    @GetMapping("/borrar")
    public String borrarArtista(@RequestParam("idArtista") int id){
        Optional<Artista> artistaOptional = artistaRepository.findById(id);
        if(artistaOptional.isPresent()){
            artistaRepository.deleteById(id);
        }
        return "redirect:/listar";
    }

    @GetMapping("/nuevo")
    public String nuevoArtista(){
        return "artista/form";
    }

    @PostMapping("/guardar")
    public String guardar(Artista artista) {
        artistaRepository.save(artista);
        System.out.println(artista.getIdArtistas());

        return "redirect:/listar";
    }

}
