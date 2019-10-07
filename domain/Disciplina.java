package trabalho.t1.domain;

public class Disciplina extends ElementoAcademico implements IPossuiSemestre {

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

	@Override
	public String toString() {
		return "Disciplina [semestre=" + semestre + ", cargaHoraria=" + cargaHoraria + ", getCodigo()=" + getCodigo()
				+ ", getNome()=" + getNome() + "]";
	}

}