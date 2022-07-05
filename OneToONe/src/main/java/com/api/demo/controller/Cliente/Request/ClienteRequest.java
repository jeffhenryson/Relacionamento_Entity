package com.api.demo.controller.Cliente.Request;

import com.api.demo.controller.Endereco.Request.EnderecoRequest;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteRequest {
	
	private String nome;
	
	private EnderecoRequest endereco;

}
