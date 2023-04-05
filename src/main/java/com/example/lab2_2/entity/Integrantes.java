package com.example.lab2_2.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="integrantes")
//idIntegrantes,Nombre,Edad,Anhios_exp,rol,artistas_idArtistas
public class Integrantes {
    @Id
    int idIntegrantes;
    String nombre;
    int edad;

    int anosexp;

    String rol;

    int artistasIdArtistas;


}
