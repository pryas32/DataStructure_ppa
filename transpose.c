
#include <stdio.h>
//summation of diagnol
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
  
  
  
  
  
  
  int sum=0;
  for(int i=0;i<m;i++)
  {
      for(int j=0;j<=i;j++)
      {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i]
arr[j][i]=temp;
            }
    }
    
    
     for(int i=0;i<m;i++)
    {
      for(int j=0;j<=i;j++)
      {
    printf("%d",arr[i][j]);   
       
      }
    }
    
    
    
    
    
  
 
  
  
    return 0;
}
