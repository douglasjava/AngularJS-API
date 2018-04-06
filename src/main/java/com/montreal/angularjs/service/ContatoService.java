package com.montreal.angularjs.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.montreal.angularjs.model.Contato;
import com.montreal.angularjs.model.Operadora;

public class ContatoService {

	private List<Contato> contatos = new ArrayList<>();

	public List<Contato> getContatos() {
		Operadora operadora = new Operadora("Oi", "14", "Celular");
		Contato contato = new Contato("Bruno", "99999-2222", new Date(), operadora);
		contatos.add(contato);

		Operadora operadora1 = new Operadora("Vivo", "15", "Celular");
		Contato contato1 = new Contato("Douglas", "99999-3333", new Date(), operadora1);
		contatos.add(contato1);

		Operadora operadora2 = new Operadora("Tim", "41", "Celular");
		Contato contato2 = new Contato("Débora", "99999-4444", new Date(), operadora2);
		contatos.add(contato2);

		Operadora operadora3 = new Operadora("GVT", "21", "Fixo");
		Contato contato3 = new Contato("Lucas", "99999-4444", new Date(), operadora3);
		contatos.add(contato3);

		return contatos;
	}
	
	public List<Operadora> getOperadora(){
		Operadora operadora = new Operadora("Oi", "14", "Celular");
		Operadora operadora1 = new Operadora("Vivo", "15", "Celular");
		Operadora operadora2 = new Operadora("Tim", "41", "Celular");
		Operadora operadora3 = new Operadora("GVT", "21", "Fixo");
		return Arrays.asList(operadora, operadora1, operadora2, operadora3);
	}

	public Contato addCurso(Contato contato) {
		// TODO Auto-generated method stub
		return null;
	}

}
