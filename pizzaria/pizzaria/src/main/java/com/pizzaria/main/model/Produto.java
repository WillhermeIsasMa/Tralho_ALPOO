package com.pizzaria.main.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_produto")
public class Produto {
    private String pizza, bebida, descricao;
    private float valor;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    
    @ManyToOne
    private Produto produto;

    public boolean atualizarValor(float nvalor) {
        return false;
    }
}
