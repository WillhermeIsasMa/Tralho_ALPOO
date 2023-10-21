package com.pizzaria.main.model.bd;

import org.springframework.data.repository.CrudRepository;
import com.pizzaria.main.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
