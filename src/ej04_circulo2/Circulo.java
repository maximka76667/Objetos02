package ej04_circulo2;

import ej02_punto.Punto;

public class Circulo {
	
	private Punto puntoCentral;
	private double radio;

	public Circulo(Punto puntoCentral, double radio) {
		this.puntoCentral = puntoCentral;
		this.radio = radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	public void printArea() {
		System.out.println("Area: " + calcularArea());
	}
	
	public double calcularLongitudCircunferencia() {
		return 2 * Math.PI * this.radio;
	}
	
	public void printLongitud() {
		System.out.println("Longitud de circunferencia: " + calcularLongitudCircunferencia());
	}
	
	public void moveX(double desplaza) {
		this.puntoCentral.moveX(desplaza);
	}
	
	public void moveY(double desplaza) {
		this.puntoCentral.moveY(desplaza);
	}
	
	public void printInfo() {
		System.out.println("Radio: " + this.radio);
		puntoCentral.printInfo();
	}
}
