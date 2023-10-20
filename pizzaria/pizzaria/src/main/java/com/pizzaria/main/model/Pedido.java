package com.pizzaria.main.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.security.Timestamp;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 
public class Pedido {
    private int numero;
    private String status, pagamento;
    private float valor;
    private Timestamp momento;

    public void adicionarItem(){

    }
    public void finalizarPedido(){

    }
}
