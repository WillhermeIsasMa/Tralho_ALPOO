package com.pizzaria.main.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String email, nome, enderecoEntrega, senha;
    private int cpf, telefone;

    public boolean logar() {
        return false;
    }

    public boolean resetSenha() {
        return false;
    }
}
