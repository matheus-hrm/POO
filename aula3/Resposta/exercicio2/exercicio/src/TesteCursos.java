import java.util.Scanner;

public class TesteCursos {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    Curso[] cursos = new Curso[4]; 
    for (int i = 0; i < cursos.length; i++) {
      Curso curso = new Curso();

      System.out.println("Digite o nome do curso: ");
      curso.nome = sc.nextLine();
      System.out.println("Digite a duraçao do curso em anos: ");
      curso.duracao = sc.nextInt();
      System.out.println("Digite a quantidade de alunos: ");
      curso.alunos = sc.nextInt();
      System.out.println("Digite o turno do curso: (M)atutino, (V)espertino ou (N)oturno : ");
      curso.turno = sc.next().charAt(0);
      sc.nextLine();
      cursos[i] = curso; 
    }

    for (int i = 0; i < cursos.length; i++) {
      System.out.println("Nome do curso: " + cursos[i].nome);
      System.out.println("Duração do curso: " + cursos[i].duracao);
      System.out.println("Quantidade de alunos: " + cursos[i].alunos);
      System.out.println("Turno do curso: " + cursos[i].turno);
    }
  }
}
