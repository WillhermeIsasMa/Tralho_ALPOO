package com.pizzaria.main.model.bd;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pizzaria.main.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
