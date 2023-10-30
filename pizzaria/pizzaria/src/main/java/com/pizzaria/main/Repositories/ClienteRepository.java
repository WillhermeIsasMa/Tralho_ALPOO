package com.pizzaria.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pizzaria.main.Model.Cliente;
@Component
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}
