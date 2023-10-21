package com.pizzaria.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.pizzaria.main.model.Pedido;
import com.pizzaria.main.model.bd.PedidoRepository;

@Controller
public class PedidoController {
    PedidoRepository pedidoRepository = new PedidoRepository();

    @RequestMapping("/pedidoPizza")
    public ModelAndView pedidoPizza(@ModelAttribute("pedido") Pedido pedido) {
        ModelAndView modelAndView = new ModelAndView("pedido");
        modelAndView.addObject("pedidoPizza", pedidoRepository.findAll());
        return modelAndView;
    }
}
