package com.br.unifor.arquitetura.solid.controller;

import com.br.unifor.arquitetura.solid.interfaces.UserInterface;
import com.br.unifor.arquitetura.solid.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserInterface userInterface;

    @GetMapping("/listar-usuario")
    public ResponseEntity<List<User>> listarususario(){
        return ResponseEntity.ok().body(userInterface.listarUsuario());
    }
}
