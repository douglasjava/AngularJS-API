package com.montreal.angularjs.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montreal.angularjs.model.Curso;
import com.montreal.angularjs.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

	@GetMapping(produces = "application/json")
	private List<Curso> listar() {
		CursoService service = new CursoService();
		return service.getCursos();
	}

	@PostMapping
	private Curso adicionar(@RequestBody Curso curso) {
		CursoService service = new CursoService();
		return service.addCurso(curso);
	}

}
