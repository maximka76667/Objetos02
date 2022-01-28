package ej02_punto;

public class Punto {
	private double x, y;
	private String nombre;

	public Punto(double x, double y) {
		this(x, y, "Punto");
	}

	public Punto(double x, double y, String nombre) {
		this.x = x;
		this.y = y;
		this.nombre = nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void moveX(double desplaza) {
		this.x += desplaza;
	}

	public void moveY(double desplaza) {
		this.y += desplaza;
	}

	public void printInfo() {
		System.out.print(this.nombre + "(" + this.x + ", " + this.y + ")");
	}
}