package ej06_autor;

public class Main {

	public static void main(String[] args) {
		Autor autor = new Autor("Nombre", "Apellido");
		
		autor.setAnoNacimiento(2030);
		
		autor.printInfo();
	}

}
