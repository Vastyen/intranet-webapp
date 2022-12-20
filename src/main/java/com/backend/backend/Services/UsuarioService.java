package com.backend.backend.Services;
import com.backend.backend.Entities.UsuarioEntity;
import com.backend.backend.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.event.CaretListener;
import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioEntity> listarTodos(){
        return (ArrayList<UsuarioEntity>) usuarioRepository.findAll();
    }

    public UsuarioEntity agregarLibro(UsuarioEntity usuarioEntity){
        return usuarioRepository.save(usuarioEntity);
    }

    public void borrarPorId(Integer id){
        usuarioRepository.deleteById(id);

    }
    public UsuarioEntity login(String email, String password){
        UsuarioEntity user = usuarioRepository.findByEmailAndPassword(email, password);
        return user;
    }

}
