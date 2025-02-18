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
    
    printf("%lld\n %d\n %lld\n %d",&x,*y,y,*(&x));








    return 0;
}
