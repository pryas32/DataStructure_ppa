/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>


int main() {
//array decalration
// we need to have declaration of array of size n first;
int n;
scanf("%d",&n);

int arr[n];

for(int i=0;i<n;i++)
{
    scanf("%d",&arr[i]);
}



int sum=0;

for(int i=0;i<n;i++)
{
    sum+=arr[i];
    
    
}



printf("%d",sum);











    return 0;
}
