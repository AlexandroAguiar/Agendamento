package br.com.alexcorp.agendamento.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.alexcorp.agendamento.model.Agencia;

public interface AgenciaDAO extends CrudRepository<Agencia, Integer>{

	public ArrayList<Agencia> findAllByOrderByNome();
}
