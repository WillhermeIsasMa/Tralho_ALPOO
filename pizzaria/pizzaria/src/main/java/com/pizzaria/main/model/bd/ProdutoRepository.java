package com.pizzaria.main.model.bd;

import org.springframework.data.repository.CrudRepository;

import com.pizzaria.main.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
