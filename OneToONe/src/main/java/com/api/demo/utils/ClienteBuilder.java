package com.api.demo.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.demo.controller.Cliente.Request.ClienteRequest;
import com.api.demo.controller.Cliente.Response.ClienteResponse;
import com.api.demo.controller.Endereco.Request.EnderecoRequest;
import com.api.demo.controller.Endereco.Response.EnderecoResponse;
import com.api.demo.models.Cliente;
import com.api.demo.models.Endereco;

@Component
public class ClienteBuilder {
	
	
	public List<ClienteResponse> buildClienteResponse(List<Cliente> clientes){
		
		return clientes.stream().map(cliente -> buildClienteResponse(cliente)).collect(Collectors.toList());
		
	}
	
	public ClienteResponse buildClienteResponse(Cliente cliente) {
		
		return ClienteResponse.builder().id(cliente.getId()).nome(cliente.getNome())
				.endereco(buildEnderecoResponse(cliente.getEndereco())).build();
	}
	
	public EnderecoResponse buildEnderecoResponse(Endereco endereco) {
		
		return EnderecoResponse.builder().bairro(endereco.getBairro()).complemento(endereco.getComplemento())
				.id(endereco.getId()).logradouro(endereco.getLogradouro()).numero(endereco.getNumero())
				.referencia(endereco.getReferencia()).build();
		
		
	}

	public Cliente buildCliente(ClienteRequest clienteRequest) {

		return Cliente.builder().nome(clienteRequest.getNome()).endereco(buildEndereco(clienteRequest.getEndereco()))
				.build();

	}

	public Endereco buildEndereco(EnderecoRequest enderecoRequest) {

		return Endereco.builder().bairro(enderecoRequest.getBairro()).complemento(enderecoRequest.getComplemento())
				.logradouro(enderecoRequest.getLogradouro()).numero(enderecoRequest.getNumero())
				.referencia(enderecoRequest.getReferencia()).build();

	}

}
