package com.pizzaria.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzaria.main.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
