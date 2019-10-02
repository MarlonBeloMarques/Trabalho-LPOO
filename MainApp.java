package trabalho.t1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno alu1 = new Aluno(1234, "Leandro", 6);
		Aluno alu2 = new Aluno(2345, "Marlon", 7);
		
		ColecaoAluno colAlu = new ColecaoAluno();
		
		colAlu.adicionaAluno(alu1);
		colAlu.adicionaAluno(alu2);
		
		ImprimeColecao<Aluno> impCol = new ImprimeColecao<Aluno>(colAlu);
		
		impCol.imprimir();
		
		System.exit(0);
	}

}
