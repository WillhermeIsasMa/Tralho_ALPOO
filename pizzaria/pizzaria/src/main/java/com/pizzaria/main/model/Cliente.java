package com.pizzaria.main.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

//import com.pizzaria.main.controller.ClienteController;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_cliente")
public class Cliente {
    private String email, nome, enderecoEntrega, senha;
    @Id
    private int cpf;
    private int telefone;

    public boolean resetSenha() {
        return false;
    }
}
