package com.montreal.angularjs.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.montreal.angularjs.model.Contato;
import com.montreal.angularjs.repository.ContatoRepository;

@RestController
@RequestMapping("/contatos")
@CrossOrigin(origins = "http://localhost/angular", methods = { RequestMethod.PUT, RequestMethod.GET,
		RequestMethod.DELETE, RequestMethod.OPTIONS })
public class ContatosResouce {

	@Autowired
	private ContatoRepository contatoRepository;

	@GetMapping(produces = "application/json")
	private List<Contato> listar() {
		return contatoRepository.findAll();
	}

	@PostMapping
	private Contato adicionar(@RequestBody @Valid Contato contato) {
		return contatoRepository.save(contato);
	}

}
