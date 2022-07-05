package com.api.demo.controller.Endereco.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnderecoResponse {
	
	private Long id;
	
	private String numero;
	 
	private String logradouro;
   
	private String complemento;

	private String bairro;

	private String referencia;


}
