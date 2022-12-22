package com.backend.backend.Services;

import com.backend.backend.Entities.Status;
import com.backend.backend.Repositories.StatusRepository;
import com.backend.backend.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Service
public class StatusService {
    @Autowired
    StatusRepository statusRepository;
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Status> listarTodos(){
        return (ArrayList<Status>) statusRepository.findAll();
    }

    // -WIP-
    //Idea: Se crea un estado con un ID y una Fecha automáticos,
    //luego se cambia el valor "null" por un string de la base de datos.
    public void actualizarEstado(Status estadoGenerado){
        //Estado
        String stringEstado =
                "Estado de las solicitudes:\n" + usuarioRepository.findAll().toString();
        estadoGenerado.setEstado(stringEstado);
        //Fecha
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date sqlDate = new Date(System.currentTimeMillis());
        dateFormat.format(sqlDate);
        estadoGenerado.setFecha_estado(sqlDate);
        //Guardar en tabla
        statusRepository.save(estadoGenerado);
    }

    public Status listarPorID(Integer id_status){
        return statusRepository.getReferenceById(id_status);
    }
}