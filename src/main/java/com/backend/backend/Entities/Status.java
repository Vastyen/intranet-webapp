package com.backend.backend.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity @Data
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Integer id_estado;
    String estado;
    String fecha_estado;

    //Getters
    public Integer getId_estado() {
        return id_estado;
    }
    public String getEstado() {
        return estado;
    }
    public String getFecha_estado() {
        return fecha_estado;
    }

    //Setters
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setFecha_estado(String fecha_estado) {
        this.fecha_estado = fecha_estado;
    }
}


