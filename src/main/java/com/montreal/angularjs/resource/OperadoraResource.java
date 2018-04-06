package com.montreal.angularjs.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.montreal.angularjs.model.Operadora;
import com.montreal.angularjs.service.ContatoService;

@RestController
@RequestMapping("/operadora")
@CrossOrigin(origins = "http://localhost/angular", 
			 methods = { RequestMethod.PUT, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.OPTIONS })
public class OperadoraResource {

	@GetMapping(produces = "application/json")
	private List<Operadora> listar() {
		ContatoService service = new ContatoService();
		return service.getOperadora();
	}

}
