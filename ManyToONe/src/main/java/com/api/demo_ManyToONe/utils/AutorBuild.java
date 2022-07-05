package com.api.demo_ManyToONe.utils;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.demo_ManyToONe.controller.autor.Request.AutorRequest;
import com.api.demo_ManyToONe.controller.autor.Response.AutorResponse;
import com.api.demo_ManyToONe.model.Autor;

@Component
public class AutorBuild {
	
	
	public List<AutorResponse> buildAutorResponse(List<Autor> autores) {
		
		return autores.stream().map(autor -> buildAutorResponse(autor)).collect(Collectors.toList());
		
	}
	 

	public AutorResponse buildAutorResponse(Autor autor) {

		return AutorResponse.builder().id(autor.getId()).nome(autor.getNome()).idade(autor.getIdade())
				.nacionalidade(autor.getNacionalidade()).descricao(autor.getDescricao()).build();

	}

	public Autor buildAutor(AutorRequest autorRequest) {

		return Autor.builder().nome(autorRequest.getNome()).idade(autorRequest.getIdade())
				.nacionalidade(autorRequest.getNacionalidade()).descricao(autorRequest.getDescricao()).build();

	}

}
