package trabalho.t1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ColecaoAluno extends ComparaNome {

	private ComparaNome compNome;
	
	private Set<Aluno> alunos = new HashSet<>();
	
	public ColecaoAluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void adicionaAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public Iterator<Aluno> getIterator(){
		return alunos.iterator();
	}
	
	public void ordena() {
		List<Aluno> alunosSorted = alunos.stream().collect(Collectors.toList());
		Collections.sort(alunosSorted, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
