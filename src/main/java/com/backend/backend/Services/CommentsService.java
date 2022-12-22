package com.backend.backend.Services;

import com.backend.backend.Entities.Comments;
import com.backend.backend.Repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class CommentsService {
    @Autowired
    CommentsRepository commentsRepository;

    public void agregarComentario(Comments comments){
        commentsRepository.save(comments);
    }

    public ArrayList<Comments> listarTodos(){
        return (ArrayList<Comments>) commentsRepository.findAll();
    }

    public Comments listarPorID(Integer id_comentario){
        return commentsRepository.getReferenceById(id_comentario);
    }

    public void borrarPorId(Integer id) {
        commentsRepository.deleteById(id);
    }
}
