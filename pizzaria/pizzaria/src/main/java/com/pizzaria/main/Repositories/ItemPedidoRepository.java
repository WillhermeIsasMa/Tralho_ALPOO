package com.pizzaria.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pizzaria.main.Model.ItemPedido;
@Component
public interface ItemPedidoRepository extends JpaRepository <ItemPedido, Integer> {
    
}
