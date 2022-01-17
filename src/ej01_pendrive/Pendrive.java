package ej01_pendrive;

public class Pendrive {
	
	double precio;
	private final double IVA = 0.18;
	
	// Marca, modelo, (Strings)
	// privados, capacidad, precio públicos (de tipo Decimal) e IVA como una
	// constante de tipo Decimal con valor 0.18 privada.
	
	public Pendrive(double precio) {
		this.precio = precio;
	}

	// Calcular IVA
	public double calcularIVA() {
		return this.precio * (1 + IVA);
	}
	
}
