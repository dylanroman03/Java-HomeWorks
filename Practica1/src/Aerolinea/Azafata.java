package Aerolinea;

public class Azafata extends Personas {
	private double altura;
	private int idiomas;

	public Azafata(int id, String nombre, int edad, int vuelo, String categoria, double altura, int idiomas) {
		super(id, edad, vuelo, nombre, categoria);
		this.altura = altura;
		this.idiomas = idiomas;
		calcularCategoria();
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Altura:" + altura + " Idiomas:" + idiomas);
	}

	@Override
	public void calcularCategoria() {
		super.calcularCategoria();

		if (super.getEdad() < 22 && idiomas <= 2) {
			super.categoria = "aprendiz";
		} else if (super.getEdad() >= 22 && idiomas <= 2) {
			super.categoria = "auxiliar";
		} else if (idiomas > 2) { 
			super.categoria = "titular";
		}
	}

	public double getAltura() {
		return altura;
	}

	public int getIdiomas() {
		return idiomas;
	}
}
