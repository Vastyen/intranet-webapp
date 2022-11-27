package com.backend.backend.Controllers;
import com.backend.backend.Services.UsuarioService;
import com.backend.backend.Repositories.UsuarioRepository;
import com.backend.backend.Services.UsuarioService;
import com.backend.backend.Entities.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/listar")
    public ResponseEntity<ArrayList<UsuarioEntity>> listarTodos() {
        ArrayList<UsuarioEntity> lista = usuarioService.listarTodos();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/add")
    public ResponseEntity<String> agregarLibro(@RequestBody UsuarioEntity usuarioEntity) {
        usuarioService.agregarLibro(usuarioEntity);
        return ResponseEntity.ok("Ta bn");
    }

    @DeleteMapping("/borrarPorId/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        usuarioService.borrarPorId((id));
        return ResponseEntity.ok("Borrado");
    }

}


