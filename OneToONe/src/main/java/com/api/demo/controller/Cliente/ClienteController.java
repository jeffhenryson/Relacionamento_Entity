package com.api.demo.controller.Cliente;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.api.demo.controller.Cliente.Request.ClienteRequest;
import com.api.demo.controller.Cliente.Response.ClienteResponse;
import com.api.demo.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	ClienteService clienteService;
	
	
	@PostMapping("")
	public ResponseEntity<ClienteResponse> cadastro(@RequestBody @Validated ClienteRequest clienteRequest, UriComponentsBuilder uriBuilder) throws Exception {
		
		ClienteResponse cliente = clienteService.salvar(clienteRequest);
		
		URI uri = uriBuilder.path("/cliente/{id}").buildAndExpand(cliente.getId()).toUri();
		
		return ResponseEntity.created(uri).body(cliente);
	}

	@GetMapping("")
	public List<ClienteResponse> listar() {
		
		return clienteService.buscar();
		
	}

	
	

}
