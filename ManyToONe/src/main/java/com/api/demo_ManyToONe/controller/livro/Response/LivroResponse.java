package com.api.demo_ManyToONe.controller.livro.Response;

import com.api.demo_ManyToONe.controller.autor.Response.AutorResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LivroResponse {

	private Long id;

	private String imagem;

	private String nome;

	private String download;

	private AutorResponse autor;

}
