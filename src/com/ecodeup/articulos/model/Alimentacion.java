package com.ecodeup.articulos.model;

public class Alimentacion {
	private String Descripcion;
	private int Dosis;
	
	public Alimentacion(String Descripcion, int Dosis) {
		this.Descripcion = Descripcion;
		this.Dosis = Dosis;
	}
	//getters y setters
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
	public int getDosis() {
		return Dosis;
	}
	public void setDosis(int Dosis) {
		this.Dosis = Dosis;
	}	
}
