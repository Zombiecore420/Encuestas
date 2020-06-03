package com.plsdo.demo.interfaces;

import org.springframework.data.repository.CrudRepository; //Importa la clase CrudRepository

import com.plsdo.demo.modelo.Persona; //Importa la clase persona

public interface IPersona extends CrudRepository<Persona, Integer> {

}
