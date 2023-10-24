package com.pizzaria.main.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;



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

    @ManyToOne
    @JoinColumn(name = "cliente_cpf")
    private Cliente cliente;

    @OneToMany
    @JoinColumn(name = "produto_codigo")
    private List<Produto> produtos;

    @OneToMany
    @JoinColumn(name = "id_itemPedido")
    private List<ItemPedido> itemPedido;

    public void adicionarItem(){
        
    }
    public void finalizarPedido(){

    }
}
