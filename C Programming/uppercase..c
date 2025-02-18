/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
   
   char ch[100];
   
   int n;
   scanf("%d",&n);
   
   
 for(int i=0;i<n;i++)
 {
     scanf("%c",&ch[i]);
 }
   
   
   int count=0;
   for(int i=0;ch[i]!='\0';i++)
   {
      
      if(ch[i]>='a' && ch[i]<='z')
      {
          ch[i]=ch[i]-32;
      }
      
      
   }
   
  for(int i=0;ch[i]!='\0';i++)
 {
     printf("%c",ch[i]);
 }
   
   
   
   
   
   
    

    return 0;
}
