package com.keepcoding.intro.app.service;
import java.util.List;

import com.keepcoding.intro.app.entity.Persona;


//Aqui definimos los metodos que vamos a tener
public interface PersonaService {
	
	//Metodos abstractos
	//metodo que devuelva listado de objetos persona
	List<Persona> listapersona();
	
	//metodo que insertar
	void insertarPersona();

}
