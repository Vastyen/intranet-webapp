package com.backend.backend.Services;
import com.backend.backend.Entities.User;
import com.backend.backend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<User> listarTodos(){
        return (ArrayList<User>) userRepository.findAll();
    }

    public User agregarLibro(User user){
        return userRepository.save(user);
    }

    public void borrarPorId(Integer id){
        userRepository.deleteById(id);
    }

}
