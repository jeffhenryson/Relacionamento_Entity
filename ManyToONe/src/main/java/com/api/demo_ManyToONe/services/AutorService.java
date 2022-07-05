package com.api.demo_ManyToONe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo_ManyToONe.controller.autor.Request.AutorRequest;
import com.api.demo_ManyToONe.controller.autor.Response.AutorResponse;
import com.api.demo_ManyToONe.repository.AutorRepository;
import com.api.demo_ManyToONe.utils.AutorBuild;

@Service
public class AutorService {

	@Autowired
	AutorRepository autorRepository;

	@Autowired
	AutorBuild autorBuild;

	public AutorResponse salvar(AutorRequest autorRequest) {

		return autorBuild.buildAutorResponse(autorRepository.save(autorBuild.buildAutor(autorRequest)));

	}

	public List<AutorResponse> buscar() {

		return autorBuild.buildAutorResponse(autorRepository.findAll());

	}

}
