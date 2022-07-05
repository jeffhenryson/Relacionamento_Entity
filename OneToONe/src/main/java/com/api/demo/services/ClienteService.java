package com.api.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.controller.Cliente.Request.ClienteRequest;
import com.api.demo.controller.Cliente.Response.ClienteResponse;
import com.api.demo.repository.ClienteRepository;
import com.api.demo.utils.ClienteBuilder;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	ClienteBuilder clienteBuilder;
	
	public ClienteResponse salvar(ClienteRequest clienteRequest) {
		
		return clienteBuilder.buildClienteResponse(clienteRepository.save(clienteBuilder.buildCliente(clienteRequest)));
		
	}
	
	public List<ClienteResponse> buscar(){
		
		return clienteBuilder.buildClienteResponse(clienteRepository.findAll());
		
	} 
	

}
