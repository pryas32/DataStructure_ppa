/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include<string.h>
//string functions
int main()
{
    
  
  char ch[3][10];//2d character array ;
  
  //contains 10 character array each of size 10 ;
  
  
  for(int i=0;i<3;i++)
  {
      scanf("%s",ch[i]);
  }
  
  
  for(int i=0;i<3;i++)
  {
      printf("%s" ,ch[i]);
  }
  
  
  
  for(int i=0;i<3;i++)
  {
      int len=0;
      
      
      
      for(int j=0;ch[i][j]!='\0';j++)
      {
          len++;
      }
      printf("%d",len);
      
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

    return 0;
}
