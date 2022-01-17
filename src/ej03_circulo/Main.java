package ej03_circulo;

import ej02_punto.Punto;

public class Main {

	public static void main(String[] args) {
		Punto punto = new Punto(10, 20);
		Circulo circulo = new Circulo(punto, 4.5);
		
		circulo.printArea();
	}

}
