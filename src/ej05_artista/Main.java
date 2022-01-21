package ej05_artista;

public class Main {

	public static void main(String[] args) {
		Artista shakira = new Artista("Shakira", "Colombia", 1977);
		
		Disco disco = new Disco("Sale de sol", shakira, 2009, 15);
		
		disco.printInfo();
	}

}
