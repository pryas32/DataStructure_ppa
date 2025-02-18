/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int *y=&10;
    
    printf("%d",*y);
    int a=10;
    int b=12;
    
    
    int *c=&(a+b);  // we cant store address of constant in pointer
    
    printf("%d",*c);
    








    return 0;
}
