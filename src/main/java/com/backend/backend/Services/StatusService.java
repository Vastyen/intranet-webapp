package com.backend.backend.Services;

import com.backend.backend.Entities.Status;
import com.backend.backend.Repositories.AttachmentRepository;
import com.backend.backend.Repositories.StatusRepository;
import com.backend.backend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {
    @Autowired
    StatusRepository statusRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    AttachmentRepository attachmentRepository;

    public ArrayList<Status> listarTodos(){
        return (ArrayList<Status>) statusRepository.findAll();
    }

    // -WIP-
    //Idea: Se crea un estado con un ID y una Fecha, luego se cambia el valor "null" por un string de la base de datos.
    public void actualizarEstado(Status estadoGenerado){
        String stringEstado =
                "Estado actual de los usuarios:\n" + userRepository.findAll().toString()
        + "\n" + "Estado actual de los archivos\n" + attachmentRepository.findAll().toString();
        estadoGenerado.setEstado(stringEstado);
        statusRepository.save(estadoGenerado);
    }

    public Status listarPorID(Integer id_status){
        return statusRepository.getReferenceById(id_status);
    }
}