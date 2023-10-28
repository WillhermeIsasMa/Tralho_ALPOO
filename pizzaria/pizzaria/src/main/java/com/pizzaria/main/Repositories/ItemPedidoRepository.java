package com.pizzaria.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzaria.main.Model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository <ItemPedido, Integer> {
    
}
