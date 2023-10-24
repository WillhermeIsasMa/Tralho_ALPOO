package com.pizzaria.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizzaria.main.model.Produto;
import com.pizzaria.main.model.bd.ProdutoRepository;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> findAll() {
        List<Produto> result = (List<Produto>) produtoRepository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Produto findById(@PathVariable Integer codigo) {
        Produto result = produtoRepository.findById(codigo).get();
        return result;
    }

    @PostMapping
    public Produto insert(@RequestBody Produto produto) {
        Produto result = produtoRepository.save(produto);
        return result;
    }

}
