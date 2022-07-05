package com.api.demo_ManyToONe.controller.autor.Request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AutorRequest {

	private String nome;

	private String idade;

	private String nacionalidade;

	private String descricao;

}
