package Aerolinea;

public class Vuelos {
	private String nombre, destino;
	private int vuelo;

	public Vuelos() {
		nombre = "";
		destino = "";
		vuelo = 0;
	}

	public Vuelos(String nombre, int vuelo, String destino) {
		this.nombre = nombre;
		this.destino = destino;
		this.vuelo = vuelo;
	}

	public void mostrar() {
		System.out.println(nombre + "-" + vuelo + "-" + destino);
	}

	public String getNombre() {
		return nombre;
	}

	public String getDestion() {
		return destino;
	}

	public int getVuelo() {
		return vuelo;
	}

}
