public class Pessoa {
  private String matheusNome;
  private int ano_nascimento;
  private String email;

  public Pessoa() {
  }

  public Pessoa(String matheusNome, int ano_nascimento, String email) {
    this.matheusNome = matheusNome;
    this.ano_nascimento = ano_nascimento;
    this.email = email;
  }

  public String getMatheusNome() {
    return matheusNome;
  }

  public void setMatheusNome(String matheusNome) {
    this.matheusNome = matheusNome;
  }

  public int getAno_nascimento() {
    return ano_nascimento;
  }

  public void setAno_nascimento(int ano_nascimento) {
    this.ano_nascimento = ano_nascimento;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void mensagem() {
    System.out.println("Olá, meu nome é " + matheusNome + " e eu nasci em " + ano_nascimento + " e meu email é " + email);
  }
  
  public void mensagem(String msg){
    System.out.println(msg);
  }
}
