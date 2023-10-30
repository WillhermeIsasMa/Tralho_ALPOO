package com.pizzaria.main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int qtd;
    private String tamanho;

    
    @ManyToOne
    @JoinColumn(name = "codigo_produto")
    private Produto produtos;
    
}
