package Examenes;

public class Bacteriologia extends Examen {
	private int nroHoras;		
	private Boolean resultado;

	public Bacteriologia(int id, String descripcion, float precio, int nroHoras, Boolean resultado) {
		super(id, descripcion, precio);
		this.nroHoras = nroHoras;
		this.resultado = resultado;
	}

	public Bacteriologia() {
		nroHoras = 0;
		resultado = false;
	}


	public Boolean getResultado() {
		return resultado;
	}
}
