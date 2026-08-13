package com.br.unifor.arquitetura.solid.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int matricula;
    private String nome;
    private String email;
    private int idade;
}
