package ej03_circulo;

import ej02_punto.Punto;

public class Circulo {
	
	private Punto puntoCentral;
	private double radio;

	public Circulo(Punto puntoCentral, double radio) {
		this.puntoCentral = puntoCentral;
		this.radio = radio;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public void printArea() {
		System.out.println(calcularArea());
	}
	
	public void printPuntoCentral() {
		puntoCentral.printInfo();
	}
}
