package com.pizzaria.main.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "tb_produto")
public class Produto {
    private String nome, descricao;
    private float valor;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    
    @OneToMany (mappedBy = "produtos")
    @Column (nullable = true)
    private List<ItemPedido> itemPedido;
    

    public boolean atualizarValor(float nvalor) {
        return false;
    }
}