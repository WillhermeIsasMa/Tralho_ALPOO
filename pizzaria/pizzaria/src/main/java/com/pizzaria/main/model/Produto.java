package com.pizzaria.main.model;

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
