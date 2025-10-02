package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

		public Numeros setNumbers (){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(3);
		numeros.add(5);
		numeros.add(6);
		numeros.add(33);
		return new Numeros(numeros);
		}
		
		public ArraysNums calculoTotal (int [] array) {
			int suma = Arrays.stream(array).sum();
			int maxNum = Arrays.stream(array).max().getAsInt();
			int minNum = Arrays.stream(array).min().getAsInt();
			double promedio = Arrays.stream(array).average().getAsDouble();

			return new ArraysNums(array,suma,maxNum,minNum,promedio);
	
		}
			
}
