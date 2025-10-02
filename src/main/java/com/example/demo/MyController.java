package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private final CalculadoraService calculadoraservice ;

	public MyController (CalculadoraService calculadoraservice) {
		this.calculadoraservice = calculadoraservice;
		
	}
	
	
	
	
}

	
