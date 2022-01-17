package ej04_circulo2;

import ej02_punto.Punto;

public class Main {

	public static void main(String[] args) {
		Punto punto = new Punto(20, 30);
		Circulo circulo = new Circulo(punto, 6);
		
		circulo.printLongitud();
		circulo.moveX(10);
		circulo.printInfo();
		circulo.setRadio(7.5);
		circulo.printInfo();
	}

}
