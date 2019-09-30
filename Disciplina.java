package trabalho.t1;

public class Disciplina extends ElementoAcademico {

	private int semestre;
	private int cargaHoraria;


	public Disciplina(int codigo, String nome, int semestre, int cargaHoraria) {
		super(codigo, nome);
		this.semestre = semestre;
		this.cargaHoraria = cargaHoraria;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}