package com.backend.backend.Repositories;


import com.backend.backend.Entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
    default UsuarioEntity findByEmailAndPassword(String email, String password) {
        return null;
    }
}
