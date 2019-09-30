package trabalho.t1;

public class Aluno extends Pessoa {

	private int semestre;
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(int matricula, String nome, int semestre) {
		super(matricula, nome);
		// TODO Auto-generated constructor stub
		this.setSemestre(semestre);
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
}
