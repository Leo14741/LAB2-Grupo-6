package com.example.lab2_2.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="proveedores")
public class Proveedores {

    @Id
    int idProveedores;
    String nombre;

    String telefono;

    String elemento;


}
