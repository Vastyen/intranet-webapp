package com.backend.backend.Entities;

import lombok.Data;
import javax.persistence.*;

@Entity @Data
public class Request {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Integer id_peticion;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    UsuarioEntity id;
    String peticion;  // Asunto
    @Column(columnDefinition = "date")
    String fecha;
}
