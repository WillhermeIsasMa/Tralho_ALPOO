package com.pizzaria.main.model.bd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pizzaria.main.model.Produto;

public interface ProdutoRepository extends CrudRepository <Produto, Integer> {
    List<Produto> findByNomeOrCodigo (String nome, int codigo);
}
