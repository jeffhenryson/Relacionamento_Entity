package com.api.demo_ManyToONe.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.demo_ManyToONe.controller.livro.Request.LivroRequest;
import com.api.demo_ManyToONe.controller.livro.Response.LivroResponse;
import com.api.demo_ManyToONe.model.Autor;
import com.api.demo_ManyToONe.model.Livro;

@Component
public class LivroBuild {

	AutorBuild autorBuild;

	public List<LivroResponse> buildLivroResponse(List<Livro> livros) {

		return livros.stream().map(Livros -> buildLivroResponse(Livros)).collect(Collectors.toList());

	}

	public LivroResponse buildLivroResponse(Livro livro) {

		return LivroResponse.builder().id(livro.getId()).nome(livro.getNome()).imagem(livro.getImagem())
				.download(livro.getDownload()).autor(autorBuild.buildAutorResponse(livro.getAutor())).build();

	}

	public Livro buildLivro(LivroRequest livroRequest, Autor autor) {

		return Livro.builder().nome(livroRequest.getNome()).imagem(livroRequest.getImagem())
				.download(livroRequest.getDownload()).autor(autor).build();

	}

}
