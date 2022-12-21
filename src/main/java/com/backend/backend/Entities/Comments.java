package com.backend.backend.Entities;

import lombok.Data;
import javax.persistence.*;

@Entity @Data
public class Comments {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Integer id_comentario;
    String comentario;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    UsuarioEntity id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_peticion")
    Request id_peticion;
}
