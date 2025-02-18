/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
  
  //pointer to pointer
  int a=12;

  
  int *p=&a;
  
  int **a1=&p;//pointer to pointer ->for holding the address of the pointer
  
  
  printf("%d\n %lld\n %lld", **a1,a1 ,&p);
  
  
  **a1=14;
  
   printf("%d\n %lld\n %lld", **a1,a1 ,&p);
  
  
    
    return 0;
}
