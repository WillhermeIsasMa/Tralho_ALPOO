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
    private String email, nome, enderecoEntrega;
    private int cpf, telefone;
    
    public boolean logar(){
        return false;
    }
    
    public boolean resetSenha(){
        return false;
    }

    public void cliente(String email, String nome, String enderecoEntrega, int cpf, int telefone){
        this.email=email;
        this.nome=nome;
        this.enderecoEntrega=enderecoEntrega;
        this.cpf=cpf;
        this.telefone=telefone;
    }

}
