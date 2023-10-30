package com.pizzaria.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pizzaria.main.Model.Produto;
@Component
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
