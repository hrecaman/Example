package com.ecodeup.articulos.model;

public class Porcino {
	private int Identificacion;
	private String Raza;
	private int Edad;
	private int Peso;
	private String Alimentacion;
	private String Cliente;
	
	public Porcino(int Identificacion, String Raza, int Edad, int Peso, String Alimentacion, String Cliente) {
		this.Identificacion = Identificacion;
		this.Raza = Raza;
		this.Edad = Edad;
		this.Peso = Peso;
		this.Alimentacion = Alimentacion;
		this.Cliente = Cliente;
	}
	//getters y setters
	public int getIdentificacion() {
		return Identificacion;
	}
	public void setIdentificacion(int Identificacion) {
		this.Identificacion = Identificacion;
	}
	public String getRaza() {
		return Raza;
	}
	public void setRaza(String Raza) {
		this.Raza = Raza;
	}
	public int getEdad() {
		return Edad;
	}
	
	public void setEdad(int Edad) {
		this.Edad = Edad;
	}
	public int getPeso() {
		return Peso;
	}
	public void setPeso(int Peso) {
		this.Peso = Peso;
	}
	public String getAlimentacion() {
		return Alimentacion;
	}
	public void setAlimentacion(String Alimentacion) {
		this.Alimentacion = Alimentacion;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String Cliente) {
		this.Cliente = Cliente;
	}
}
