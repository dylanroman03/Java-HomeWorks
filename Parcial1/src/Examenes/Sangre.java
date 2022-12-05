package Examenes;

public class Sangre extends Examen {
	private String perfil;
	private int resultado;

	public Sangre(int id, String descripcion, float precio, String perfil, int resultado) {
		super(id, descripcion, precio);
		this.perfil = perfil;
		this.resultado = resultado;
	}

	public Sangre() {
		super();
		perfil = "";
		resultado = 0;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public int getResultado() {
		return resultado;
	}
}
