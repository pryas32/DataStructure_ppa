/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
   
   //sorting character array;
   
    int n;
   scanf("%d",&n);
   
   
   char arr[n];
  
   char arr1[n];
   
   for(int i=0;i<n;i++)
   {
       scanf("%c",&arr[i]);
   }
   
   
   for(int i=0;i<n;i++)
   {
       arr1[i]=arr[i];
   }
   
   
   
   for(int i=0;arr1[i]!='\0';i++)
   printf("%c",arr1[i]);
   
    

    return 0;
}
