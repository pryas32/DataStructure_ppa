/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    //pointer arithemetic and substraction are possible but pointer division and multiplication not possible as they dont have any significance on number line
    
    
    
    //operations that we can perform on pointers itself
    
    
    //for two pointers we can compare them , we can substract them , we cant add them or * or / them .
    
    
    int arr[]={1,2,3,4};
    
    int *p=arr; 
  
    int *p1=&arr[3];
    int d1=(p1-p);
    printf("%d",d1);
    
  // we can compare two pointers of same data type.
  
  
  if(p1>p){
    printf("p1 is greater than p");
  }
  else{
    printf("p is greater than p1");
  }
  
    
    
    
    
    
    
    
    
    
    
    
    return 0;
}
