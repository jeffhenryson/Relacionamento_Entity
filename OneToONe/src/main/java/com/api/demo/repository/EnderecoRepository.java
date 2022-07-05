package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
