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
      scanf("%c",&arr1[i]);
   }
   
   
   int i=0;
   while(arr[i]!='\0' && arr1[i]!='\0')
  {
   if(arr[i]!=arr1[i])
   {
       printf("false");
       break;
   }
   i++;
  }
  
  if(arr1[i]=='\0' && arr[i]=='\0')
  {
      printf("true");
  }
  else{
      printf("they are different");
  }
 
    return 0;
}
