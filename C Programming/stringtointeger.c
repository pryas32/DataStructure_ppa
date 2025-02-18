/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include<math.h>
//string functions
int main()
{
  char ch[10]="546";
 
 
 int len=0;
 for(int i=0;ch[i]!='\0';i++)
 {
     len++;
 }
 int i1=0;
  int summation=0;
  for(int i=len-1;i>=0;i--)
  {
      int sum=ch[i]-'0';
      
      summation=sum*pow(10,i1)+summation;
      i1++;
  }
  
  
  printf("%d",summation);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

    return 0;
}
