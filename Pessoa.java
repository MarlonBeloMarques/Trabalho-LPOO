package trabalho.t1;

public class Pessoa implements IPossuiNome {

	private int matricula;
	private String nome;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
}
