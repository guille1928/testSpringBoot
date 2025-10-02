package com.example.demo;


public class ArraysNums {
	
	private int [] arrayNum = new int[5];
    private int suma;         // suma de los números
    private int max;          // número mayor
    private int min;          // número menor
    private double promedio;  //average

	
    // constructor
    public ArraysNums(int[] arrayNum, int suma, int max, int min, double promedio) {
        this.arrayNum = arrayNum;
        this.suma = suma;
        this.max = max;
        this.min = min;
        this.promedio = promedio;
    }


	public int[] getArrayNum() {
		return arrayNum;
	}


	public void setArrayNum(int[] arrayNum) {
		this.arrayNum = arrayNum;
	}


	public int getSuma() {
		return suma;
	}


	public void setSuma(int suma) {
		this.suma = suma;
	}


	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public double getPromedio() {
		return promedio;
	}


	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	
}
