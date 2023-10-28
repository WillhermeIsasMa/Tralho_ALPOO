package com.pizzaria.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizzaria.main.Model.Pedido;
import com.pizzaria.main.Repositories.PedidoRepository;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
    @Autowired
    PedidoRepository pedidoRepository;
    
    public List<Pedido> findall(){
        List<Pedido> result = pedidoRepository.findAll();
        return result;
    }
}