package com.br.unifor.arquitetura.solid.interfaces;

import com.br.unifor.arquitetura.solid.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInterface {
    public List<User> listarUsuario();
    public ResponseEntity<User> buscarUsuario(int matricula);
}
