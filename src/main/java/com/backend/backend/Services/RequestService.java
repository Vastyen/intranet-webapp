package com.backend.backend.Services;

import com.backend.backend.Entities.Request;
import com.backend.backend.Repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class RequestService {
    @Autowired
    RequestRepository requestRepository;

    public void enviarSolicitud(Request request){
        requestRepository.save(request);
    }

    public ArrayList<Request> listarTodos(){
        return (ArrayList<Request>) requestRepository.findAll();
    }

    public Request listarPorID(Integer id_solicitud){
        return requestRepository.getReferenceById(id_solicitud);
    }

    public void borrarPorId(Integer id) {
        requestRepository.deleteById(id);
    }
}
