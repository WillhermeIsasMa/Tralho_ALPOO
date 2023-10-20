package com.pizzaria.main.model;

@getter
@setter 
public class Pedido {
    private int numero;
    private String status, pagamento;
    private float valor;
    private timestamp momento;

    public void adicionarItem(){

    }
    public void finalizarPedido(){

    }

    public void pedido(int n, String s, String p, float v, timestamp m){
        this.n=numero;
        this.s=status;
        this.p=pagamento;
        this.v=valor;
        this.m=momento;
    }
}
