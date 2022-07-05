package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
