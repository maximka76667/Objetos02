package ej05_artista;

import java.time.LocalDate;

public class Disco {

	private String titulo;
	private Artista artista;
	private int anoLanzamiento, numCanciones;
	
	public Disco(String titulo, Artista artista, int anoLanzamiento, int numCanciones) {
		this.titulo = titulo;
		this.artista = artista;
		this.anoLanzamiento = anoLanzamiento;
		this.numCanciones = numCanciones;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public Artista getArtista() {
		return this.artista;
	}
	
	public int getAnoLanzamiento() {
		return this.anoLanzamiento;
	}
	
	public int getNumCanciones() {
		return this.numCanciones;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	public void setAnoLanzamiento(int anoLanzamiento) {
		this.anoLanzamiento = anoLanzamiento;
	}
	
	public void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;
	}
	
	public int getAntiguedad() {
		return LocalDate.now().getYear() - this.anoLanzamiento; 
	}
	
	public void printInfo() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Artista: ");
		this.artista.printInfo();
		System.out.println("Ano lanzamiento: " + this.anoLanzamiento);
		System.out.println("Numero canciones: " + this.numCanciones);
		System.out.println("Antiguedad: " + this.getAntiguedad());
	}
}
