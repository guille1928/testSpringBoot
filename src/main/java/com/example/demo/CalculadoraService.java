package com.example.demo;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

		public Numeros setNumbers (){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(43);
		return new Numeros(numeros);
		}
			
}
