package com.backend.backend.Controllers;

import com.backend.backend.Entities.Comments;
import com.backend.backend.Services.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@CrossOrigin("*")
@RequestMapping("/comentarios")
public class CommentsController {
    @Autowired
    CommentsService commentsService;

    @PostMapping("/create")
    public ResponseEntity<String> agregarComentario(@RequestBody Comments comment){
        commentsService.agregarComentario(comment);
        return ResponseEntity.ok("Comentario Agregado");
    }

    @GetMapping("/read")
    public ResponseEntity<ArrayList<Comments>> listarTodos() {
        ArrayList<Comments> lista = commentsService.listarTodos();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/read/{id}")
    public Comments listarPorID(@PathVariable Integer id){
        return commentsService.listarPorID(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> borrarComentario(@PathVariable Integer id) {
        commentsService.borrarPorId((id));
        return ResponseEntity.ok("El comentario ha sido borrado");
    }
}
