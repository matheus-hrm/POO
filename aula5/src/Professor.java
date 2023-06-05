
public abstract class Professor implements FuncionarioAssalariado, Estudante{
	private String nome;
	private int nTurmas;
	private double salario;

	public Professor(String nome, int nTurmas, double salario) {
		this.nome = nome;
		this.nTurmas = nTurmas;
		this.salario = salario;
	}
	
	public <Provas> Provas[] elaborarProvas() {
		
	}
	public double corrigirProva (Prova p) {
		
	}
	
	
}
