package com.pizzaria.main.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class ItemPedido {
    private int qtd;
    private String tamanho;
    
    @OneToMany
    @JoinColumn(name = "produto_codigo")
    private Produto produto;
}
