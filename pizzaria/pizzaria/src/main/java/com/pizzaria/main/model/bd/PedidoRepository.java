package com.pizzaria.main.model.bd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pizzaria.main.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
    List<Pedido> findByPedidoOrCPF(int numero, int cpf);
}