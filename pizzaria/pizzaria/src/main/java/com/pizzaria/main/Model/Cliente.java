package com.pizzaria.main.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_cliente")
public class Cliente {
    private String email, nome, endereco_Entrega, senha;
    @Id
    private long cpf;
    private long telefone;

    public boolean resetSenha() {
        return false;
    }
}