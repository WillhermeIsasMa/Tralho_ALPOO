package com.pizzaria.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pizzaria.main.Model.Cliente;
import com.pizzaria.main.Repositories.ClienteRepository;

@ComponentScan(basePackages = {"pizzaria.*"})
@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public ModelAndView cliente(){
    ModelAndView usuarios = new ModelAndView();
    usuarios.setViewName("cliente");
    usuarios.addObject("cliente", clienteRepository.findAll());
    return usuarios;
    }


    @GetMapping("/cadastro")
    public ModelAndView nnew(){
        ModelAndView usuarios = new ModelAndView();
        usuarios.setViewName("cadastro");
        return usuarios;
    }
    @PostMapping("/cadastro")
    public String insert(Cliente cliente){
        clienteRepository.save(cliente);
        return "redirect:/cardapio";
    }
}