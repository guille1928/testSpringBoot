package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holamundo {

	
	@GetMapping("/hola")
	public String Holamundo() {
		
		return "Hola mundo";
		
	}
	
	
	@GetMapping("/usuario")
	public List<Usuario> ObtenerUsers(){
		
		
	return List.of(
			new Usuario("Maria Fernandez Gomez", "maria@gmail.com"),
			new Usuario("Carlos Garcia Lopez", "carlos23@gmail.com")	
			);	
	}
	
}
