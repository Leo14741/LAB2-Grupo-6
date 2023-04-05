package com.example.lab2_2.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="artistas")
//idArtistas,Nombre_Grupo,Fecha_creacion,Tipo_musica
public class Artista {

    @Id
    int idArtistas;
    String nombreGrupo;

    String fecha;

    String fechaCreacion;

    String tipoMusica;


}
