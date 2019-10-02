package trabalho.t1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ColecaoAluno implements IColecaoGenerica<Aluno> {

	/*
	 * TODO verificar se esta correto
	 */
	private ComparaNome compNome;
	
	private Set<Aluno> alunos = new HashSet<>();
	
	public ColecaoAluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void adicionaAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void ordena() {
		List<Aluno> alunosSorted = alunos.stream().collect(Collectors.toList());
		Collections.sort(alunosSorted, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
	}

	@Override
	public Iterator<Aluno> getIterator() {
		// TODO Auto-generated method stub
		return alunos.iterator();
	}

}
