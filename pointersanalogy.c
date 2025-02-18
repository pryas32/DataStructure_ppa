#include <stdio.h>
int main()
{
  // int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};
   
   
   
   
  // int *p=arr;
   
   
  // for(int i=0;i<3;i++)
  // { 
  //   printf("%lld\n",arr[i]);//elemt are stored at contigous memory location in 2d array .
  // }
   
   
   
   
   int *p[3];
   
   
   int a[]={1,2,3};
   int b[]={4,5,6};
   int c[]={7,8,9};
   
   
   
   p[0]=a;
   p[1]=b;
   p[2]=c;
   
   
   for(int i=0;i<3;i++)
   {
     for(int j=0;j<3;j++){
     printf("%d",*(*(p+i)+j)); or p[i][j] both are equivalent;
   }
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
