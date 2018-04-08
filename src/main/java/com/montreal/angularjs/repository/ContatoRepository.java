package com.montreal.angularjs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montreal.angularjs.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
