
public class Principal {

	public static void main(String[] args) {
		Professor maria = new ProfessorUniversitario("Maria", 2, 1000);
		Professor jose = new ProfessorDaEducacaoBasica("Jose", 3, 2000);
		Aluno matheus = new Aluno("matheus", 12345);
	//Caso seja feita em dupla, colocar criar o objeto SegundoNomedoEstudante
				Estudante[] pessoasQueEstudam = new Estudante[3];
				pessoasQueEstudam[0] = maria;
				pessoasQueEstudam[1] = jose;
				pessoasQueEstudam[2] = matheus;
				//Caso seja feita em dupla, colocar no vetor o SegundoNomedoEstudante
				for (Estudante estudante: pessoasQueEstudam)
					estudante.estudar();

				Prova[] provasDaFaculdade = maria.elaborarProvas();
				matheus.fazerProva(provasDaFaculdade[0]);
				//Caso seja feita em dupla, colocar a prova para o SegundoNomedoEstudante
				maria.corrigirProva(provasDaFaculdade[0]);
				System.out.println("João tirou "+ provasDaFaculdade[0].getNota() + " na prova");
				//Caso seja feita em dupla, imprimir o segundo estudante

	}

}
