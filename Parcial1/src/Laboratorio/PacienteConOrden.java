package Laboratorio;

import Examenes.Bacteriologia;
import Examenes.Examen;

public class PacienteConOrden extends Persona {
	private String fecha;
	private Examen[] orden;
	private double montoPago;

	public PacienteConOrden(String apellido, String nombre, int cedula, char sexo, int edad, String telf, String fecha, Examen[] orden, double montoPago) {
		super(cedula, edad, apellido, nombre, telf, sexo);
		this.fecha = fecha;
		this.orden = orden;
		this.montoPago = montoPago;
	}

	// Override Method (Sobre carga de metodo)
	@Override
	public String getNombreCompleto() {
		return super.getNombre() + "\t" + super.getApellido();
	}

	// OverLoad Method (Sobre carga del metodo)
	public String getNombreCompleto(int cedula) {
		return cedula + "\t"  + super.getApellido() + "\t" + super.getNombre();
	}

	public void calcularSensibilidad() {
		boolean isSensible = false;

		for (Examen examen : orden) {
			boolean isBac = examen instanceof Bacteriologia ? true : false;
			if (isBac) {
				Bacteriologia bacteriologia = (Bacteriologia) examen;
				if (bacteriologia.getResultado()) {
					isSensible = true;
				}
			}
		}

		String message = isSensible ? "Es Sensible" : "No es Sensible";
		System.out.print(message);
	}
	
	public void calcularMontoPagado() {
		float monto = (float) 0.0;
		double descuento = 0.00;

		for (Examen examen : orden) {
			monto +=	examen.calcularPrecioReal();
		}
		
		if(orden.length > 3) {
			descuento = monto * 0.08;
		}

		montoPago = monto - descuento;
	}


	public Examen[] getOrden() {
		return orden;
	}

	public double getMontoPago() {
		return montoPago;
	}
}