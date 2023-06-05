public class Matheus extends Pessoa{
  private String identidade;

  public Matheus (String matheusNome, int ano_nascimento, String email, String identidade) {
    super(matheusNome, ano_nascimento, email);
    this.identidade = identidade;
  }
  public String getMatheusNome() { 
    return super.getMatheusNome();
  }
  public String getIdentidade() {
    return identidade;
  }
  public void setIdentidade(String identidade) {
    this.identidade = identidade;
  }
}
