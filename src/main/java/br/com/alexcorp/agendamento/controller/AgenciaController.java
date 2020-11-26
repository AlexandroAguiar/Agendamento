package br.com.alexcorp.agendamento.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexcorp.agendamento.dao.AgenciaDAO;
import br.com.alexcorp.agendamento.model.Agencia;

@RestController
@CrossOrigin("*")
public class AgenciaController {
	
	@Autowired
	private AgenciaDAO dao;
	
	@GetMapping("/agencias")
	public ArrayList<Agencia> recuperarTodas(){
		ArrayList<Agencia> lista;
		//lista = (ArrayList<Agencia>)dao.findAll();
		lista = dao.findAllByOrderByNome();
		return lista;
		
		
	}

}
