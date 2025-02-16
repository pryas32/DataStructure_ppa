
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
      for(int j=i;j<n;j++)
      {
          
          if(i==j){
            sum+=arr[i][j];
            break;
          }
          
          
          
      }
  }
  
  
  
  for(int i=0;i<m;i++)
  {
      for(int j=n-i-1;j>=0;j--)
      {
            sum+=arr[i][j];
            break;
          
          
      }
          
          
          
      }
  
  if(m%2!=0){
  sum=sum-arr[m/2][n/2];
  }
  
  
  printf("%d",sum);
  
  
  
  
    return 0;
}
