package com.montreal.angularjs.service;

import java.util.ArrayList;
import java.util.List;

import com.montreal.angularjs.model.Curso;

public class CursoService {

	private static List<Curso> listaCurso = new ArrayList<>();

	public List<Curso> getCursos() {
		listaCurso.add(new Curso(1L, "Matematica"));
		listaCurso.add(new Curso(2L, "Português"));
		listaCurso.add(new Curso(3L, "Física"));
		listaCurso.add(new Curso(4L, "Historia"));
		return listaCurso;
	}

	public Curso addCurso(Curso curso) {
		listaCurso.add(curso);
		return curso;
	}

}
