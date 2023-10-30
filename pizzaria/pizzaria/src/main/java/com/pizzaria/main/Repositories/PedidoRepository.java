package com.pizzaria.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pizzaria.main.Model.Pedido;
@Component
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}

    
