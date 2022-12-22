package com.backend.backend.Controllers;

import com.backend.backend.Entities.AnualStadistic;
import com.backend.backend.Entities.Request;
import com.backend.backend.Services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@CrossOrigin("*")
@RequestMapping("/estadisticas")
public class StadisticsController {
    @Autowired
    RequestService requestService;

    @GetMapping("/resumen-anual")
    public ResponseEntity<ArrayList<AnualStadistic>> resumenAnual(){
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        ArrayList<AnualStadistic> salida = new ArrayList<>(0);
        for(int i = 0; i < 12; i++){
            ArrayList<Request> filtrado = requestService.filtrarPorMes(Integer.toString(i+1));
            AnualStadistic anualStadistic = new AnualStadistic();
            anualStadistic.setFecha(meses[i]);
            anualStadistic.setCantidad(filtrado.size());
            salida.add(anualStadistic);
        }
        return ResponseEntity.ok(salida);
    }

    @GetMapping("/test")
    public ResponseEntity<ArrayList<AnualStadistic>> test(){
        return null;
    }

}
