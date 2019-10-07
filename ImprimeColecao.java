package trabalho.t1;

import java.util.Iterator;

import trabalho.t1.domain.IColecaoGenerica;

public class ImprimeColecao<E> {
	
	private IColecaoGenerica<E> col;
	
	public ImprimeColecao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImprimeColecao(IColecaoGenerica<E> colecaoGenerica) {
		this.col = colecaoGenerica; 
	}

	public void imprimir() {
		Iterator<E> Iterator = col.getIterator();
		
		while (Iterator.hasNext()) {
			System.out.println(Iterator.next());
		}
	}
}
