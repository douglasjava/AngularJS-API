package com.montreal.angularjs.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.montreal.angularjs.model.Contato;
import com.montreal.angularjs.service.ContatoService;

@RestController
@RequestMapping("/contatos")
@CrossOrigin(origins = "http://localhost/angular", 
		     methods = { RequestMethod.PUT, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.OPTIONS })
public class ContatosResouce {

	@GetMapping(produces = "application/json")
	private List<Contato> listar() {
		ContatoService service = new ContatoService();
		return service.getContatos();
	}

	@PostMapping
	private Contato adicionar(@RequestBody Contato contato) {
		ContatoService service = new ContatoService();
		return service.addCurso(contato);
	}

}
