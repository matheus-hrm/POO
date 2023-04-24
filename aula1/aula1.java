package aula1;
import javax.swing.JOptionPane;
public class aula1 {
  public static void main(String[] args) {
     caneta c1 = new caneta();
      c1.cor = JOptionPane.showInputDialog("Qual a cor da caneta?");
      c1.ponta = Float.parseFloat(JOptionPane.showInputDialog("Qual a ponta da caneta?"));
      c1.modelo = JOptionPane.showInputDialog("Qual o modelo da caneta?");
      c1.tampar();
      c1.destampar();
      c1.rabiscar();

      JOptionPane.showMessageDialog(null, "Cor: " + c1.cor + " Ponta: " + c1.ponta + " Modelo: " + c1.modelo);

  }
}
