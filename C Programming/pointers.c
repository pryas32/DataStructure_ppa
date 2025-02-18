/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    
    //pointer -> thy are used for storing the address of the variable
    
    //we can store the address in int variable but we cant be able to derefrence value from that variable.
    //pointer that is holding the value of a varible should be of same data type as that of variable.
    
    
    // int x=10;
    
    // int *y=&x;
    
    // printf("%d\n%lld\n%lld",*y,&x,y);


//for holding character address we have character pointer.


char ch='A';

char *arr=&ch;

printf("%p %p",(void *)arr,(void *)&ch);












    return 0;
}
