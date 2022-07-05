package com.api.demo_ManyToONe.controller.livro.Request;

import com.api.demo_ManyToONe.controller.autor.Request.AutorRequestID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LivroRequest {
	
	private String imagem;

	private String nome;

	private String download;

	private AutorRequestID autor;

}
