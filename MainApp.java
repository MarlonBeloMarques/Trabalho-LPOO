package trabalho.t1;

import trabalho.t1.domain.Aluno;
import trabalho.t1.domain.Disciplina;
import trabalho.t1.service.ColecaoAluno;
import trabalho.t1.service.ColecaoDisciplina;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno alu1 = new Aluno(1234, "Leandro", 6);
		Aluno alu2 = new Aluno(2345, "Marlon", 7);
		Aluno alu3 = new Aluno(1234, "Leandro", 3);
		Aluno alu4 = new Aluno(1244, "Leandro", 3);
		Aluno alu5 = new Aluno(1244, "Ana", 5);
		
		ColecaoAluno colAlu = new ColecaoAluno();
		ColecaoDisciplina colDiscp = new ColecaoDisciplina();
		
		colAlu.adicionaAluno(alu1);
		colAlu.adicionaAluno(alu2);
		colAlu.adicionaAluno(alu3);
		colAlu.adicionaAluno(alu4);
		colAlu.adicionaAluno(alu5);
		
		colAlu.ordena();
		
		ImprimeColecao<Aluno> impCol1 = new ImprimeColecao<Aluno>(colAlu);
		
		impCol1.imprimir();
		
		Disciplina discp1 = new Disciplina(1, "POO", 6, 40);
		Disciplina discp2 = new Disciplina(2, "Compiladores", 6, 40);
		Disciplina discp3 = new Disciplina(3, "POO", 7, 40);
		Disciplina discp4 = new Disciplina(4, "POO", 5, 40);
		Disciplina discp5 = new Disciplina(5, "POO", 7, 40);
		
		colDiscp.adicionaDisciplina(discp1);
		colDiscp.adicionaDisciplina(discp2);
		colDiscp.adicionaDisciplina(discp3);
		colDiscp.adicionaDisciplina(discp4);
		colDiscp.adicionaDisciplina(discp5);
		
		colDiscp.ordena();
		
		ImprimeColecao<Disciplina> impCol2 = new ImprimeColecao<Disciplina>(colDiscp);
		
		impCol2.imprimir();
		
		System.exit(0);
	}

}
