package Aerolinea;

public class Piloto extends Personas {
	private int horas;

	public Piloto(int id, String nombre, int edad, int vuelo, String categoria, int horas) {
		super(id, edad, vuelo, nombre, categoria);
		this.horas = horas;
		calcularCategoria();
	}

	public Piloto() {
		super();
	}

	public int getHoras() {
		return horas;
	}	

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Horas de vuelo: " + horas);
	}

	@Override
	public void calcularCategoria() {
		super.calcularCategoria();

		if (horas > 1500) {
			super.categoria = "Capitan";
		} else if (horas <= 1500) {
			super.categoria = "1er Piloto";
		}
	}
}
