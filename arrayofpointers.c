/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
  
  int *pointers[3];
  
  int x=12;
  pointers[0]=&x;
  
  int y=13;
  pointers[1]=&y;
  
  
    int z=1;
  pointers[2]=&z;
  
  
  
  
  for(int i=0;i<3;i++)
  {
    printf("%lld\n %lld",pointers[i],&x);//gives address of &x and similarly &y 
  }
  printf("\n");
  
   
  for(int i=0;i<3;i++)
  {
    printf("%d\n",*pointers[i]); //gives value at & x and so on .
  }
  
  
  
  
  
  
  
    
    return 0;
}
