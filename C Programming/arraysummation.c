
#include <stdio.h>

int main()
{
   int m,n;
   scanf("%d%d",&m,&n);
   
   int arr[m][n];
   
   
   
   int m1,n1;
   scanf("%d%d",&m1,&n1);
   
   
   int arr1[m][n];
   
   
   if(m!=m1)
   {
       printf("sum of matrix not possible");
   }
   
   if(n!=n1)
   {
       printf("sum of matrix not possible");
   }
   
   
   for(int i=0;i<m;i++)
   {
       for(int j=0;j<n;j++)
       {
           scanf("%d",&arr[i][j]);
       }
   }
   
   
    for(int i=0;i<m1;i++)
   {
       for(int j=0;j<n1;j++)
       {
           scanf("%d",&arr1[i][j]);
       }
   }
   
   
   int sum[m][n]; 
   
   for(int i=0;i<m;i++)
   {
       for(int j=0;j<n;j++)
       {
           sum[i][j]=arr1[i][j]+arr[i][j];
       }
   }
   
   
   for(int i=0;i<m1;i++)
   {
       for(int j=0;j<n1;j++)
       {
           printf("%d ",sum[i][j]);
       }
       printf("\n");
   }
   
    return 0;
}
