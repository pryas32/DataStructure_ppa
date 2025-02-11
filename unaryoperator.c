#include <stdio.h>
 
int main(void) {
//unary operator -> in this we have only one operand and on thta only we perform functions
// int x=1;
// int a=x++;//post increment/post decrement-> first return then increase/decrease.
 
// printf("%d\n%d",a,x);
 
//operator priority
 
//post increment or post decrement(L to R) > pre increment decrement(R to L)>(%,/,*)(L to R)>(+,-)(L to R)
//assignment operator at the last
 
//expression->having a lot of line of code having many arithematic operator.
 
int x1=2;
int y1=12;
int z1=1;
int x=++x1+x1++*y1+z1;
 
printf("%d\n%d",x,x1);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	return 0;
}
 
