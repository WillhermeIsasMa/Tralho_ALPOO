package com.pizzaria.main.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Component
public class ItemPedido {
    private int qtd;
    private String tamanho;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @JoinColumn(name = "produto_codigo")
    private Produto produto;
}
