package Aerolinea;

public class Personas {
	private int id, edad, vuelo;
	private String nombre;
	protected String categoria;

	public Personas() {
		id = 0;
		edad = 0;
		vuelo = 0;
		nombre = "";
		categoria = "";
	}

	public Personas(int id, int edad, int vuelo, String nombre, String categoria) {
		this.id = id;
		this.edad = edad;
		this.vuelo = vuelo;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre + " Edad: " + edad + " Categoria: " + categoria);
	}

	public void calcularCategoria() {
	}

	public int getId() {
		return id;
	}

	public int getEdad() {
		return edad;
	}

	public int getVuelo() {
		return vuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCategoria() {
		return categoria;
	}
}
