package trabalho.t1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno alu1 = new Aluno(1234, "Leandro", 6);
		Aluno alu2 = new Aluno(2345, "Marlon", 7);
		
		Disciplina discp1 = new Disciplina(1, "POO", 6, 40);
		Disciplina discp2 = new Disciplina(2, "Compiladores", 6, 40);
		
		ColecaoAluno colAlu = new ColecaoAluno();
		ColecaoDisciplina colDiscp = new ColecaoDisciplina();
		
		colAlu.adicionaAluno(alu1);
		colAlu.adicionaAluno(alu2);
		
		colDiscp.adicionaDisciplina(discp1);
		colDiscp.adicionaDisciplina(discp2);
		
		ImprimeColecao<Aluno> impCol1 = new ImprimeColecao<Aluno>(colAlu);
		ImprimeColecao<Disciplina> impCol2 = new ImprimeColecao<Disciplina>(colDiscp);
		
		impCol1.imprimir();
		System.out.println();
		impCol2.imprimir();
		
		System.exit(0);
	}

}
