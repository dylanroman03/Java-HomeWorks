package Ejecucion;

import Examenes.*;
import Herramientas.*;
import Laboratorio.PacienteConOrden;

public class Implementacion implements Maximos {
	static Datos datos = new Datos();
	public static PacienteConOrden[] vecPacientes = new PacienteConOrden[datos.longPacientes()];

	public static void main(String[] args) {
		cargar();
		listadoSensibles();
		listadoHormonal();
	}

	public static void cargar() {
		int longPacientes = datos.longPacientes();
		int examensCount = 0;
		int examens = 0;

		for (int i = 0; i < longPacientes; i++) {
			String pacienteStr = datos.getPaciente(i);
			String[] dataArray = pacienteStr.split(" ");
			int edad = 0;
			String fecha = "";

			if (dataArray.length == 7) {
				edad = Integer.parseInt(dataArray[4]);
				examens = Integer.parseInt(dataArray[6]);
			} else {
				examens = Integer.parseInt(dataArray[5]);
			}

			Examen[] examenes = new Examen[examens];

			for (int j = examensCount; j < examensCount + examens; j++) {
				String examenStr = datos.getExamen(j);
				String[] examenArray = examenStr.split("-");
				float precio = (float) Double.parseDouble(examenArray[5]);

				if (examenArray[2].compareTo("B") == 0) {
					boolean result = examenArray[7].compareTo("true") == 0 ? true : false;

					Bacteriologia examen = new Bacteriologia(Integer.parseInt(examenArray[3]), examenArray[4], precio, Integer.parseInt(examenArray[6]), result);
					examenes[j - examensCount] = examen;
				} else {
					Sangre examen = new Sangre(Integer.parseInt(examenArray[3]), examenArray[4], precio, examenArray[6], Integer.parseInt(examenArray[7]));
					examenes[j - examensCount] = examen;
				}

				fecha = examenArray[2];

			}

			PacienteConOrden paciente = new PacienteConOrden(dataArray[0], dataArray[1], Integer.parseInt(dataArray[2]),
					dataArray[3].charAt(0), edad, dataArray[5], fecha, examenes, 0.00);
			vecPacientes[i] = paciente;

			examensCount += examens;
		}
	}

	public static void listadoSensibles() {
		System.out.println("\u001B[31mLISTADO GENERAL DE PACIENTES\u001B[0m");
		System.out.println("\u001B[34mCEDULA\tAPELLIDO\tNOMBRE\tSens Bact.\tMONTO PAGO\u001B[0m");
		for (PacienteConOrden paciente : vecPacientes) {
			paciente.calcularMontoPagado();

			System.out.print(paciente.getNombreCompleto(paciente.getCedula()) + "\t");
			paciente.calcularSensibilidad();
			System.out.print("\t" + String.format("%.2f", paciente.getMontoPago()) + "\n");
		}
	}

	public static void listadoHormonal() {
		System.out.println("\n\n\u001B[31mLISTADO HORMONAL\u001B[0m");
		System.out.println("\u001B[34mNombre\tApellido\tDescripcion del Examen\tResultado\u001B[0m");

		for (PacienteConOrden paciente : vecPacientes) {
			boolean flag = false;
			Examen[] examenes = paciente.getOrden();

			for (Examen examen : examenes) {
				boolean isSangre = examen instanceof Sangre ? true : false;
				if (isSangre) {
					Sangre sangre = (Sangre) examen;

					if (sangre.getPerfil().compareTo("Hormonal") == 0) {
						if (!flag) {
							System.out.println(paciente.getNombreCompleto() + "\t\t" 
									+ sangre.getDescripcion() + "\t\t"
									+ sangre.getResultado());
							flag = true;
						} else {
							System.out.println("\t\t\t" + sangre.getDescripcion() + "\t\t" + sangre.getResultado());
						}
					}
				}
			}
		}
	}
}