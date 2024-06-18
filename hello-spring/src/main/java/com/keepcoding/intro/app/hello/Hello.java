package com.keepcoding.intro.app.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.intro.app.entity.Persona;

@RestController	
public class Hello {
	
		@Autowired
		Persona persona;
	
//		Persona objPersona1;
//		Persona objPersona2;
//		Persona objPersona3;
		List listaPersona = null;
		
		
		@GetMapping("/saludar")
		public List<Persona> saludar() {
//			Persona objPersona1 = new Persona("Ruben", "Fresneda", "44882214Z", "cem20814@gmail.com", (long) 616794156);
//			Persona objPersona2 = new Persona("Ruben", "Fresneda", "44882214Z", "cem20814@gmail.com", (long) 616794156);
//			Persona objPersona3 = new Persona("Ruben", "Fresneda", "44882214Z", "cem20814@gmail.com", (long) 616794156);
//			
			listaPersona= new ArrayList<>();
			persona.setNombre("Ramon");
			persona.setApellido("Sanchez");
			persona.setDni("l23232");
			persona.setEmail("dlksjfg@gmail.com");
			persona.setTelefono(963759596);
			listaPersona.add(persona);
			
			
//			listaPersona.add(objPersona1);
//			listaPersona.add(objPersona2);
//			listaPersona.add(objPersona3); 
			
			return listaPersona;
			
		}
}
