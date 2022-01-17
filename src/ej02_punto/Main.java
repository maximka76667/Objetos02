package ej02_punto;

public class Main {

	public static void main(String[] args) {
		Punto miPunto = new Punto(10, 40);
		
		miPunto.printInfo();
		
		miPunto.moveX(5);
		miPunto.moveY(-3);
		miPunto.moveX(-10);
		miPunto.moveY(20);
		miPunto.moveY(3);
		
		miPunto.printInfo();
	}

}
