import java.util.Scanner;

public class TestaMatheus {
  public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite o ano de nascimento: ");
    int anoNascimento = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer

    System.out.print("Digite o e-mail: ");
    String email = scanner.nextLine();

    Pessoa p1 = new Pessoa(nome, anoNascimento, email);
    p1.mensagem();

    System.out.print("Digite a matrícula do professor: ");
    String matricula = scanner.nextLine();

    Professor professor = new Professor(nome, anoNascimento, email, matricula);
    professor.mensagem("Olá, meu nome é " + professor.getMatheusHRM() + " e eu nasci em " + professor.getAno_nascimento() + " e meu email é " + professor.getEmail() + " e minha matrícula é " + professor.getMatricula());

    System.out.print("Digite a identidade do Matheus: ");
    String identidade = scanner.nextLine();

    Matheus matheus = new Matheus(nome, anoNascimento, email, identidade);
    matheus.mensagem("Olá, meu nome é " + matheus.getMatheusNome() + " e eu nasci em " + matheus.getAno_nascimento() + " e meu email é " + matheus.getEmail() + " e minha identidade é " + matheus.getIdentidade());
    

  }
}
