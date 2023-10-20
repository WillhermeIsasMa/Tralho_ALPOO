package com.pizzaria.main.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private String nome, descricao;
    private float valor;

    public boolean atualizarValor(float nvalor){
        return false;
    }

    public void produto(String n, String d, float v){
        nome = n;
        descricao = d;
        valor = v;
    }
}
