#include <stdio.h>
#include <stdlib.h>

int main(void){
  int mat[3][3];
  int i, j;

  for(i=0; i<3; i++){
    for(j=0; j<3; j++){
      scanf("%d", &mat[i][j]);
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
      printf("%d ", mat[i][j]);
    }
    printf("\n");
  }

  return 0;

}

