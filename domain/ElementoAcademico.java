package trabalho.t1.domain;

public abstract class ElementoAcademico implements IPossuiNome {

	private int codigo;
	private String nome;

	public ElementoAcademico(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}