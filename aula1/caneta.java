package aula1;

public class caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void rabiscar(){
    if (this.tampada == true){
      System.out.println("ERRO! Não posso rabiscar");
    } else {
      System.out.println("Estou rabiscando");
    }
  }
  void tampar(){
    this.tampada = true;
  }
  void destampar(){
    this.tampada = false;
  } 
 
}
