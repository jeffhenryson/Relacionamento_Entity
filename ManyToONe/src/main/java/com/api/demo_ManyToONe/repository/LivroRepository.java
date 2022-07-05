package com.api.demo_ManyToONe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo_ManyToONe.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
