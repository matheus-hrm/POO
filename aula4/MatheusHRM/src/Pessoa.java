import java.util.Scanner;

public class Pessoa {
  public String matheusNome;
  public int ano_nascimento;
  public String email;
  Scanner sc = new Scanner(System.in);

  public void Pessoa() {
    matheusNome = sc.nextLine();
    ano_nascimento = sc.nextInt();
    email = sc.nextLine();
  }

  public void Pessoa(String matheusNome, int ano_nascimento, String email) {
    matheusNome = this.matheusNome; 
    ano_nascimento = this.ano_nascimento;
    email = this.email;
  }

  public String getMatheusNome() {
    matheusNome = sc.nextLine();
    return matheusNome;
  }

  public void setMatheusNome(String matheusNome) {
    this.matheusNome = matheusNome;
  }

  public int getAno_nascimento() {
    ano_nascimento = sc.nextInt();
    return ano_nascimento;
  }

  public void setAno_nascimento(int ano_nascimento) {
    this.ano_nascimento = ano_nascimento;
  }

  public String getEmail() {
    email = sc.nextLine();
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
