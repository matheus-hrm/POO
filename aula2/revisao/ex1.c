#include <stdio.h>
#include <stdlib.h>

void checaimpar(int n){
  
  if(n%2 == 0){
    n = n*10;
  }
  else{
    n+=1;
  }
  printf("%d", n);
}

int main(void){

  int n;
  scanf("%d", &n);

  checaimpar(n);

  return 0;
}