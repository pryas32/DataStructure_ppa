/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    //char ch[100];
    //whenver taking any character array as input 
    //declare of one more than size as to keep last character as '\0'
    
    
    char ch[10];
    
    
    for(int i=0;i<9;i++)
    {
        scanf("%c",&ch[i]);
    }
    
    
      for(int i=0;i<9;i++)
    {
       printf("%c ",ch[i]);//print this a b c d e f h i j as last character it put as '\0';
    }
    
    
    

    return 0;
}
