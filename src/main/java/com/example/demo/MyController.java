package com.example.demo;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private final CalculadoraService calculadoraservice ;

	public MyController (CalculadoraService calculadoraservice) {
		this.calculadoraservice = calculadoraservice;
		
	}
	//send data via Post
	@PostMapping("/calcula")
	public ArraysNums datos (@RequestBody int [] array){

		return calculadoraservice.calculoTotal(array);
				
	}
				
				
		
		
	}
	
	



	
