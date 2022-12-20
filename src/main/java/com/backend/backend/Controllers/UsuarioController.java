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
import java.util.Objects;
import java.util.Optional;


@Controller
@RequestMapping("/usuarios")
@CrossOrigin("*")
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

    @GetMapping("/get-by-id")
    public ResponseEntity<UsuarioEntity> getById(@PathVariable("id") String id){
        Integer idGenerado = Integer.parseInt(id);
        Optional<UsuarioEntity> encontrado = usuarioService.getById(idGenerado);
        if(encontrado.isPresent()){
            return ResponseEntity.ok(encontrado.get());
        }
        return ResponseEntity.noContent().build();
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
    @GetMapping("/login")
    public ResponseEntity<Integer> login(@RequestBody UsuarioEntity user){
        UsuarioEntity authUser = usuarioService.login(user.getEmail(),user.getPassword());
        if(authUser == null){
            System.out.println("Usuario no encontrado");
            return ResponseEntity.badRequest().body(-1);
        }
        return ResponseEntity.ok(authUser.getId());
    }

}


