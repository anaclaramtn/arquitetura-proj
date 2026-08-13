package com.br.unifor.arquitetura.solid.service;

import com.br.unifor.arquitetura.solid.interfaces.UserInterface;
import com.br.unifor.arquitetura.solid.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements UserInterface {
    @Override
    public List<User> listarUsuario() {
        User user = new User(2517337, "Ana Clara", "anaclaramtn@gmail.com", 22);

        List <User> users = new ArrayList<>();
        users.add(user);

        return users;
    }

    @Override
    public ResponseEntity<User> buscarUsuario(int matricula) {
        return null;
    }
}
