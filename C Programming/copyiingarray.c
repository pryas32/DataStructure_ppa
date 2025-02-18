/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>


int main() {
//array decalration
// we need to have declaration of array of size n first;
int n,d;
scanf("%d %d",&n,&d);

int arr[n];

for(int i=0;i<n;i++)
{
    scanf("%d",&arr[i]);
}


int array[n];


for(int i=0;i<n;i++)
{
    array[i]=arr[i];
}



for(int i=0;i<n;i++)
{
    printf("%d ",array[i]);
}





//copying array into another one


    return 0;
}
