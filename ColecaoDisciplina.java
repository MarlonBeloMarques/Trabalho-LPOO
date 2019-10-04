package trabalho.t1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ColecaoDisciplina implements IColecaoGenerica<Disciplina> {

	private Set<Disciplina> disciplinas = new HashSet<>();

	public ColecaoDisciplina() {
		super();
	}

	public void adicionaDisciplina(Disciplina disciplina) {
		int i = 0;
		for (Disciplina disc : disciplinas) {
			i = ComparaNome.compare(disciplina, disc);
		}
		
		if(i == 0)
			disciplinas.add(disciplina);
	}

	public void ordena() {
		List<Disciplina> disciplinaSorted = disciplinas.stream().collect(Collectors.toList());
		Collections.sort(disciplinaSorted, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
	}
	
	public Iterator<Disciplina> getIterator() {
		return disciplinas.iterator();
	}
}