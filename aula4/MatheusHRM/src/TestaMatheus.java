import java.util.Scanner;

public class TestaMatheus {
  public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    
    Pessoa p1 = new Pessoa();
    p1.setMatheusNome("Matheus");
    p1.setAno_nascimento(2003); 
    p1.setEmail("matheus@email.com");
    p1.mensagem();
    
    Matheus m1 = new Matheus(null, 0, null, null);
    m1.setMatheusNome("Matheus");
    m1.setAno_nascimento(2003);
    m1.setEmail("");
    m1.setIdentidade("123456789");
    m1.mensagem();
    
    Professor p2 = new Professor();
   
    p2.mensagem("Ola meu nome e " + p2.getMatheusNome() + " e minha matricula e " + p2.getMatricula());


    

  }
}
