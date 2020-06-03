package com.plsdo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plsdo.demo.interfaceService.IPersonaService;
import com.plsdo.demo.interfaces.IPersona;
import com.plsdo.demo.modelo.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona data;
	
	@Override 
	public List<Persona> list() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
