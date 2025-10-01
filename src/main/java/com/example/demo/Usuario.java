package com.example.demo;

public class Usuario {
	
	//variables de usuario
	
	private String nombre;
	private String email;
	
	//contructor and getters and setters
	
	public Usuario (String nombre, String email) {
		this.nombre = nombre;
		this.email= email;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
