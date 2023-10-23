package com.pizzaria.main.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pizzaria.main.model.Cliente;
import com.pizzaria.main.model.bd.ClienteRepository;

import org.springframework.transaction.annotation.Transactional;

@Controller@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> findAll() {
        List<Cliente> result = (List<Cliente>) clienteRepository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Cliente findById(@PathVariable Integer cpf) {
        Cliente result = clienteRepository.findById(cpf).get();
        return result;
    }

    @PostMapping("/cadastroCliente")
    @Transactional
    public Cliente cadastrar(@ModelAttribute("cliente") Cliente pcliente) {
        Cliente cliente = new Cliente(pcliente.getEmail(), pcliente.getNome(), pcliente.getSenha(),
                pcliente.getEnderecoEntrega(), pcliente.getTelefone(), pcliente.getCpf());
        clienteRepository.save(cliente);
        return cliente;
    }

}
