package trabalho.t1.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import trabalho.t1.domain.Aluno;
import trabalho.t1.domain.IColecaoGenerica;

public class ColecaoAluno implements IColecaoGenerica<Aluno> {

	private Set<Aluno> alunos = new HashSet<>();
	private List<Aluno> alunosSorted = new ArrayList<>();
	
	public ColecaoAluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void adicionaAluno(Aluno aluno) {
		int i = 0;
		if(alunos.isEmpty())
			alunos.add(aluno);
		for (Aluno aluno2 : alunos) {
			if(ComparaNome.compare(aluno, aluno2) == 1 && ComparaSemestre.compare(aluno, aluno2) == 1) {
				i++;
			}
		}
		
		if(i == 0)
			alunos.add(aluno);
		else
			System.out.println("Não inserido: "+ aluno.getNome() + ", pois já contém esse aluno nesse semestre.");
	}
	
	public void ordena() {
		alunosSorted = alunos.stream().collect(Collectors.toList());
		Collections.sort(alunosSorted, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
	}

	@Override
	public Iterator<Aluno> getIterator() {
		// TODO Auto-generated method stub
		if(alunosSorted.isEmpty())
			return alunos.iterator();
		else
			return alunosSorted.iterator();
	}

}
