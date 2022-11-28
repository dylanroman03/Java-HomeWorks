package Aerolinea;

public class Pasajero extends Personas {
	private String numAsiento;	
	private int valorPasaje;


	public Pasajero() {
		super();
		numAsiento = "";
		valorPasaje = 0;
	}


	public Pasajero(int id, String nombre, int edad, int vuelo, String categoria, String numAsiento, int valorPasaje) {
		super(id, edad, vuelo, nombre, categoria);
		this.numAsiento = numAsiento;
		this.valorPasaje = valorPasaje;

		calcularCategoria();
	}


	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Asiento: " + numAsiento + " Valor: " + valorPasaje);
	}

	@Override
	public void calcularCategoria() {
		super.calcularCategoria();
		if (valorPasaje < 450) {
			super.categoria = "economica";
		} else if (valorPasaje == 450) {
			super.categoria = "turista";
		} else {
			super.categoria = "1era clase";
		}
	}

	public String getNumAsiento() {
		return numAsiento;
	}


	public int getValorPasaje() {
		return valorPasaje;
	}
}
