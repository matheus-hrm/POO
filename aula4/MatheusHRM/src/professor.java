import java.util.Scanner;
public class Professor extends Pessoa {
  private String matricula;

  public Professor (String matheusNome, int ano_nascimento, String email, String matricula) {
    super(matheusNome, ano_nascimento, email);
    matricula = this.matricula;
  }
  public Professor() {
    super();
    setMatricula(matricula);
  }
  protected String getMatricula(){
    return matricula;
  }
  protected void setMatricula(String matricula){
    this.matricula = matricula;
  }
  public String getNome () {
    return getMatheusNome();
  }
}
