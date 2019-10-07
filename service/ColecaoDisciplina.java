package trabalho.t1.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import trabalho.t1.domain.Disciplina;
import trabalho.t1.domain.IColecaoGenerica;

public class ColecaoDisciplina implements IColecaoGenerica<Disciplina> {

	private Set<Disciplina> disciplinas = new HashSet<>();
	private List<Disciplina> disciplinaSorted = new ArrayList<>();

	public ColecaoDisciplina() {
		super();
	}

	public void adicionaDisciplina(Disciplina disciplina) {
		int i = 0;
		if(disciplinas.isEmpty())
			disciplinas.add(disciplina);
		for (Disciplina disciplina2 : disciplinas) {
			if(ComparaNome.compare(disciplina, disciplina2) == 1 && ComparaSemestre.compare(disciplina, disciplina2) > 0) {
				i++;
			}
		}	
		if(i == 0)
			disciplinas.add(disciplina);
		else
			System.out.println("Não inserido: "+ disciplina.getNome() + ", pois já contém essa disciplina nesse semestre.");
	}

	public void ordena() {
		disciplinaSorted = disciplinas.stream().collect(Collectors.toList());
		Collections.sort(disciplinaSorted, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
	}
	
	public Iterator<Disciplina> getIterator() {
		if(disciplinaSorted.isEmpty())
			return disciplinas.iterator();
		else
			return disciplinaSorted.iterator();
	}
}