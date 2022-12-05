package Herramientas;

public class Datos {
	private String[] pacientes = {"Chacon Luis 20456789 M 32 04166769999 2","Perez Maria 21345678 F 25 04125463561 4","Mora Doris 22123456 F 36 04146764567 3","Alvarez Jose 19876543 M 04267564636 2","Suarez Rosana 27768456 F 04243456789 1"};
	private String[] examenes = {"20456789-01/01/2018-S-101-Hematologia completa-350.0-Hematologia-12",
	"20456789-01/01/2018-S-105-Contaje de plaquetas-310.0-Hematologia-800",
	"21345678-01/01/2018-S-202-Glicemia basal-550.0-Quimica clinica-85",
	"21345678-01/01/2018-S-301-Anticuerpo antinucleares-850.0-Autoinmunidad-85",
	"21345678-10/01/2018-S-102-Hemoglobina y hematocrito-620.0-Hematologia-8",
	"21345678-10/01/2018-B-406-Cultivo de esputos-1050.0-48-true",
	"22123456-12/01/2018-B-409-Cultivo de LCR-2500.0-72-false",
	"22123456-12/01/2018-S-506-TSH libre-1900.0-Hormonal-120",
	"22123456-12/01/2018-B-401-Coloracion de Gram-1530.0-120-true",
	"19876543-15/01/2018-S-505-T4 libre-1600.0-Hormonal-120",
	"19876543-15/01/2018-S-504-T3 libre-1600.0-Hormonal-50",
	"27768456-19/01/2018-B-402-Coloracion de Ziehl y Neelsen-3530.0-120-false"};

	public Datos() {
	}

	public String getPaciente(int i) {
		try {
			return pacientes[i];	
		} catch (Exception e) {
			System.out.println("Paciente no encontrado");
			return null;
		}
	}

	public String getExamen(int i) {
		try {
			return examenes[i];	
		} catch (Exception e) {
			System.out.println("Examen no encontrado");
			return null;
		}
	}

	public int longPacientes() {
		return pacientes.length;	
	}

	public int longExamenes() {
		return examenes.length;	
	}
}
