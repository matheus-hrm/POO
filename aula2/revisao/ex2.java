package aula2.revisao;
import java.util.Scanner;

public class ex2 {  
    public static void main(String[] args) { 
      Scanner input = new Scanner(System.in);
      int[][] mat = new int[3][3];
      int i, j;
  
      for(i=0; i<3; i++){
        for(j=0; j<3; j++){
          mat[i][j] = input.nextInt();
        }
      }
  
      for(i=0; i<3; i++){
        for(j=0; j<3; j++){
          if (mat[i][j] % 2 == 0){
            mat[i][j] = mat[i][j] * 10;
          }
          else{
            mat[i][j] = mat[i][j] + 1;
          }
        }
      }
  
      for(i=0; i<3; i++){
        for(j=0; j<3; j++){
          System.out.print(mat[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
  