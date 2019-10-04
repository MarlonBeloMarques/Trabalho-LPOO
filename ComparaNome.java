package trabalho.t1;

public class ComparaNome {
	
	public static int compare(IPossuiNome nome1, IPossuiNome nome2 ) {
		if(nome1.getNome().equalsIgnoreCase(nome2.getNome())) {
			System.out.println("Nomes iguais: " + nome1.getNome());
			return 0;
		}
		return 1;
	}
	
}

