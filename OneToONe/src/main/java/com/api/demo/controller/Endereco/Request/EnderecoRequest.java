package com.api.demo.controller.Endereco.Request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnderecoRequest {
	
	private String numero;
 
	private String logradouro;
   
	private String complemento;

	private String bairro;

	private String referencia;

}
