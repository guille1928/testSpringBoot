package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



public class Holamundo {

    private final CalculadoraService calculadoraService;


    Holamundo(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

	
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
	
	@GetMapping("/array")
	public List<Numeros> muestra (){
		return List.of(
				new CalculadoraService().setNumbers()
				);	
		
	}

	@GetMapping("/calculo")
	public List<ArraysNums> lista (){
		return List.of (new CalculadoraService().calculoTotal(array));	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

