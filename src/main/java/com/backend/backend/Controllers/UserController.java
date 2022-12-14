package com.backend.backend.Controllers;
import com.backend.backend.Services.UserService;
import com.backend.backend.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@Controller
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/listar")
    public ResponseEntity<ArrayList<User>> listarTodos() {
        ArrayList<User> lista = userService.listarTodos();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/add")
    public ResponseEntity<String> agregarLibro(@RequestBody User user) {
        userService.agregarLibro(user);
        return ResponseEntity.ok("Ta bn");
    }

    @DeleteMapping("/borrarPorId/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        userService.borrarPorId((id));
        return ResponseEntity.ok("Borrado");
    }

}


