package Examenes;

public class Examen {
	private int id;
	private String descripcion;
	private float precio;

	public Examen(int id, String descripcion, float precio) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Examen() {
		id = 0;
    descripcion = "";
    precio = (float) 0.0;
	}

	public Float calcularPrecioReal() {
		return (float) (precio + (precio * 0.12));
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getPrecio() {
		return precio;
	}
}
