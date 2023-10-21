package com.pizzaria.main.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "tb_cliente")
public class Cliente {
    private String email, nome, enderecoEntrega, senha;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int cpf;
    private int telefone;

    public boolean logar() {
        return false;
    }

    public boolean resetSenha() {
        return false;
    }
}
