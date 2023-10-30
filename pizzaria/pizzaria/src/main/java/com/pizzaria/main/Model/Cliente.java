package com.pizzaria.main.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Component
@Entity
@Table(name = "tb_cliente")
public class Cliente {
    private String email, nome, endereco_Entrega, senha;
    @Id
    private long cpf;
    private long telefone;

    
    @OneToMany (mappedBy = "clientes")
    @Column (nullable = true)
    private List<Pedido> pedidos;

    public boolean resetSenha() {
        return false;
    }
}