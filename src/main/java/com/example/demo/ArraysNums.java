package com.example.demo;


public class ArraysNums {
	
	private int [] arrayNum = new int[5];
	int n,n1,n2;
	double n3;
	
	//constructor 
	public ArraysNums (int [] arrayNum,int n,int n1,int n2, double n3) {
		this.arrayNum = arrayNum;
		this.n = n;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public ArraysNums(int[] arrayNum) {
		super();
		this.arrayNum = arrayNum;
	}

	//to get the values you need return
	public int[] getArrayNum() {
		return arrayNum;
	}
	//to set the values you use void with no return
	public void setArrayNum(int[] arrayNum) {
		this.arrayNum = arrayNum;
	}

	
	
	
	
	
	
	
}
