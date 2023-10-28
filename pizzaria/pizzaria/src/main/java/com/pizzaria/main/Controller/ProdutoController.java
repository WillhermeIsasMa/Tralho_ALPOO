package com.pizzaria.main.Controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//import com.pizzaria.main.Model.Produto;
import com.pizzaria.main.Repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping ("/cardapio")
    public ModelAndView index() {
        ModelAndView cardapio = new ModelAndView();
        cardapio.setViewName("index");
        cardapio.addObject("cardapio", produtoRepository.findAll());
        return cardapio;
    }
    /*public List<Produto> findall(){
        List<Produto> result = produtoRepository.findAll();
        result.addObject("cardapio", "MSG");
        return result;
    }*/
}
