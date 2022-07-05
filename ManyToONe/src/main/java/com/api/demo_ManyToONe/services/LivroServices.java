package com.api.demo_ManyToONe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.demo_ManyToONe.controller.livro.Request.LivroRequest;
import com.api.demo_ManyToONe.controller.livro.Response.LivroResponse;
import com.api.demo_ManyToONe.model.Autor;
import com.api.demo_ManyToONe.repository.AutorRepository;
import com.api.demo_ManyToONe.repository.LivroRepository;
import com.api.demo_ManyToONe.utils.LivroBuild;

public class LivroServices {

	@Autowired
	LivroBuild livroBuild;

	@Autowired
	LivroRepository livroRepository;

	@Autowired
	AutorRepository autorRepository;

	public LivroResponse salvar(LivroRequest livroRequest) throws Exception {

		Optional<Autor> autorOptional = autorRepository.findById(livroRequest.getAutor().getId());

		if (autorOptional.isPresent()) {

			return livroBuild
					.buildLivroResponse(livroRepository.save(livroBuild.buildLivro(livroRequest, autorOptional.get())));

		}

		throw new Exception("Autor não existente!");

	}
	
	
	public List<LivroResponse> buscar(){
		
		return livroBuild.buildLivroResponse(livroRepository.findAll());
		
	}
	
	
	
	
	
	
	

}
