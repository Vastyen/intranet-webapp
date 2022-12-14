package com.backend.backend.Entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable = false)
    Integer id;
    String email;
    String password;
    String rango;
}