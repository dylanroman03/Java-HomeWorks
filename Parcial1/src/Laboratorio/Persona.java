package Laboratorio;

public abstract class Persona {
	private int cedula, edad;	
	private String apellido, nombre, telf;
	private char sexo;

	public Persona(int cedula, int edad, String apellido, String nombre, String telf, char sexo) {
		this.cedula = cedula;
		this.edad = edad;
		this.apellido = apellido;
		this.nombre = nombre;
		this.telf = telf;
		this.sexo = sexo;
	}

	public Persona() {
		cedula = 0;
		edad = 0;
		apellido = "";
    nombre = "";
		telf = "";
	}

	public abstract String getNombreCompleto();

	public int getCedula() {
		return cedula;
	}

	public int getEdad() {
		return edad;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelf() {
		return telf;
	}

	public char getSexo() {
		return sexo;
	}
}
