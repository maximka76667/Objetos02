package ej05_artista;

import java.time.LocalDate;

public class Artista {

	private String nombre, pais;
	private int anoNacimiento;
	
	public Artista(String nombre, String pais, int anoNacimiento) {
		this.nombre = nombre;
		this.pais = pais;
		this.anoNacimiento = anoNacimiento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	public int getAnoNacimiento() {
		return this.anoNacimiento;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void setNombre(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}
	
	public int getEdad() {
		return LocalDate.now().getYear() - this.anoNacimiento;
	}
	
	public void printInfo() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Pais: " + this.pais);
		System.out.println("Ano de nacimiento: " + this.anoNacimiento);
		System.out.println("Edad: " + getEdad());
	}
}
