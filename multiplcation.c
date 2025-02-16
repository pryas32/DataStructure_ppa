/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
//c matrix multiplication
#include <stdio.h>

int main()
{
  int m,n;
  
  
  scanf("%d%d",&m,&n);
  
  int arr[m][n];
  
  for(int i=0;i<m;i++)
  {
      for(int j=0;j<n;j++)
      {
          scanf("%d",&arr[i][j]);
      }
  }
  
  
  
  
  
  
  
  int m1,n1;
  
  scanf("%d%d",&m1,&n1);
  
  int arr2[m1][n1];
  
  
  for(int i=0;i<m1;i++)
  {
      for(int j=0;j<n1;j++)
      {
          scanf("%d",&arr2[i][j]);
      }
  }
  

if(n!=m1)
{
    printf("multiplication not posssible");
}
  
  
  int result[m][n1];


for(int i=0;i<m;i++)
{   
    for(int j=0;j<n1;j++)
    {        result[i][j]=0;
        for(int k=0;k<m;k++){
        
        result[i][j]+=arr[i][k]*arr2[k][j];
    }
    }
}


 //multiplication of matrices


  for(int i=0;i<m;i++)
  {
      for(int j=0;j<n1;j++)
      {
          printf("%d ",result[i][j]);
      }
      printf("\n");
  }
  
  
  
  
  
  

    return 0;
}
