package com.pizzaria.main.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Component
public class ItemPedido {
    private int qtd;
    private String tamanho;
    
    @ManyToOne
    @JoinColumn(name = "produto_codigo")
    private Produto produto;
}
