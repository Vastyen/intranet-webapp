package com.backend.backend.Controllers;

import com.backend.backend.Entities.Status;
import com.backend.backend.Services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/estado")
@CrossOrigin("*")
public class StatusController {

    @Autowired
    StatusService statusService;

    @GetMapping("/listar")
    public ResponseEntity<ArrayList<Status>> listarTodos() {
        ArrayList<Status> lista = statusService.listarTodos();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/listarPorID/{id}")
    public Status listarPorID(@PathVariable Integer id){
        return statusService.listarPorID(id);
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generarEstado(Status status){
        statusService.actualizarEstado(status);
        return ResponseEntity.ok("Estado generado, mi pana");
    }

}
