package com.api.demo.controller.Cliente.Response;

import com.api.demo.controller.Endereco.Response.EnderecoResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteResponse {
	
	private Long id;

	private String nome;

	private EnderecoResponse endereco;
}
