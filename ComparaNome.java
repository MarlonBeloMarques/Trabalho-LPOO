package trabalho.t1;

public class ComparaNome {
	
	public static int compare(IPossuiNome nome1, IPossuiNome nome2 ) {
		if(nome1.getNome().compareTo(nome2.getNome()) == 0) {
			return 1;
		} else
			return 0;
	}
	
}

