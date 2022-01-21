package ej06_autor;

import java.time.LocalDate;

public class Autor {

	String nombre, apellidos, pais;
	int anoNacimiento;

	public Autor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAnoNacimiento() {
		return anoNacimiento;
	}

	public void setAnoNacimiento(int anoNacimiento) {
		if (anoNacimiento > LocalDate.now().getYear())
			System.out.println("Error anoNacimiento");
		else this.anoNacimiento = anoNacimiento;
	}
	
	public void printInfo() {
		System.out.println(this.toString());
	}
	
	public int calcularEdad() {
		return LocalDate.now().getYear() - this.anoNacimiento;
	}
	
	public int getEdad() {
		return calcularEdad();
	}
	
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", pais=" + pais + ", anoNacimiento="
				+ anoNacimiento + "]";
	}
}
