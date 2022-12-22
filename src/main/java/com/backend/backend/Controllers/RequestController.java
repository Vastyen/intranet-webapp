package com.backend.backend.Controllers;

import com.backend.backend.Entities.Request;
import com.backend.backend.Services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@Controller
@CrossOrigin("*")
@RequestMapping("/solicitudes")
public class RequestController {
    @Autowired
    RequestService requestService;

    @PostMapping("/create")
    public ResponseEntity<String> enviarSolicitud(@RequestBody Request request){
        requestService.enviarSolicitud(request);
        return ResponseEntity.ok("Solicitud Enviada.");
    }

    @GetMapping("/read")
    public ResponseEntity<ArrayList<Request>> listarTodos() {
        ArrayList<Request> lista = requestService.listarTodos();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/read/{id}")
    public Request listarPorID(@PathVariable Integer id){
        return requestService.listarPorID(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> borrarSolicitud(@PathVariable Integer id) {
        requestService.borrarPorId((id));
        return ResponseEntity.ok("La solicitud ha sido eliminada.");
    }
}
