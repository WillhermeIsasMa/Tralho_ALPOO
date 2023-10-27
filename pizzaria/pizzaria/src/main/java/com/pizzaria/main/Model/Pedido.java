package com.pizzaria.main.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "tb_pedido")
public class Pedido {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int numero;
    private String status, pagamento;
    private float valor;
    private Timestamp momento;

    public void adicionarItem(){

    }
    public void finalizarPedido(){

    }

}
