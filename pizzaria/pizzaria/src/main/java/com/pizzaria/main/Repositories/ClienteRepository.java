package com.pizzaria.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzaria.main.Model.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
    
}
