/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int x=10;
    int *y=&x;
    
    printf("%lld\n %d",&x,*y);
    
printf("\n");

*y=11;
 printf("%d\n %d",x,*y);
    
printf("\n");

int *z=&x;

*z=115;
 printf("%d\n %d",x,*z);











    return 0;
}
