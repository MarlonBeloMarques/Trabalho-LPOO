package trabalho.t1;

public class ComparaSemestre {
	
	public static int compare(IPossuiSemestre semestre1, IPossuiSemestre semestre2 ) {
		if(semestre1.getSemestre() == semestre2.getSemestre()) {
			return 1;
		} else
			return 0;
	}
	
}

