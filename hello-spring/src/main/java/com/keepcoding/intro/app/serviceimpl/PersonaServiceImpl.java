package com.keepcoding.intro.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.intro.app.entity.Persona;
import com.keepcoding.intro.app.service.PersonaService;

@Service

public class PersonaServiceImpl implements PersonaService{
	//Inyectando el objeto persona
	@Autowired
	Persona persona;
	
	
	//declaro una lista de persona
	List<Persona> lista = new ArrayList<>();
	
	Persona objPersona1;
	Persona objPersona2;
	Persona objPersona3;
	
	
	@Override
	public List<Persona> listapersona() {
		
		if (lista.size() == 0 || lista.size() == 1) {
		Persona objPersona1 = new Persona("Ruben", "Fresneda", "44882214Z", "cem20814@gmail.com", (long) 616794156);
		Persona objPersona2 = new Persona("Ruben", "Fresneda", "44882214Z", "cem20814@gmail.com", (long) 616794156);
		Persona objPersona3 = new Persona("Ruben", "Fresneda", "44882214Z", "cem20814@gmail.com", (long) 616794156);
		
		lista.add(objPersona1);
		lista.add(objPersona2);
		lista.add(objPersona3); 
		}
		return lista;
		
//		for (int i = 0; i < 3; i++) {
//
//		//Cargo los datos a objeto persona
//		//persona = null;
//		persona.setNombre("Jose" +i);
//		persona.setApellido("Bonaparte" +i);
//		persona.setEmail("skdjf@gmail.com" +i);
//		persona.setDni("44882214Z" +i);
//		persona.setTelefono(963759593);
//		//Añado a la lista el objeto persona inyectado
//		lista.add(persona);
		
		
		

	}

	@Override
	public void insertarPersona() {
		persona.setNombre("Carlos");
		persona.setApellido("Gomez");
		persona.setEmail("skjf@gmail.com");
		persona.setDni("44882215Z");
		persona.setTelefono(963755677);
		lista.add(persona);
		
	}

}
