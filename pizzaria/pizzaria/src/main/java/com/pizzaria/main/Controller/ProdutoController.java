package com.pizzaria.main.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pizzaria.main.Model.Produto;
import com.pizzaria.main.Repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/cardapio")
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public ModelAndView index() {
        ModelAndView cardapio = new ModelAndView();
        cardapio.setViewName("index");
        cardapio.addObject("cardapio", produtoRepository.findAll());
        return cardapio;
    }

    @PostMapping(value = "/novoProduto")
    public Produto insert(@RequestBody Produto produto){
        Produto result = produtoRepository.save(produto);
        return result;
    }
    /*public List<Produto> findall(){
        List<Produto> result = produtoRepository.findAll();
        result.addObject("cardapio", "MSG");
        return result;
    }*/
}
