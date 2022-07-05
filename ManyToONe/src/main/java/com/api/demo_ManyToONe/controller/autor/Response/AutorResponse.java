package com.api.demo_ManyToONe.controller.autor.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AutorResponse {

	private Long id;

	private String nome;

	private String idade;

	private String nacionalidade;

	private String descricao;

}
