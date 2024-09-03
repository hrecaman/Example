package com.ecodeup.articulos.model;

public class Clientes {
	private int Cedula;
	private String Nombres;
	private String Apellidos;
	private String Direccion;
	private int Telefono;
	
	public Clientes(int Cedula, String Nombres, String Apellidos, String Direccion, int Telefono) {
		this.Cedula = Cedula;
		this.Nombres = Nombres;
		this.Apellidos = Apellidos;
		this.Direccion = Direccion;
		this.Telefono = Telefono;
	}
	//getters y setters
	public int getCedula() {
		return Cedula;
	}
	public void setCedula(int Cedula) {
		this.Cedula = Cedula;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String Nombres) {
		this.Nombres = Nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	
	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int Telefono) {
		this.Telefono = Telefono;
	}
}
