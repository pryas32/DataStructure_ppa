#include <stdio.h>
 
int main(void) {
//swapping two number  with or without 3rd variable
 
int a=12;
int b=10;
 
 
a=a+b;
b=a-b;
a=a-b;
 
 
printf("%d\n%d",a,b);
 
//using third extra variable
 
int c=a;
a=b;
b=c;
 
 
printf("\n");
 
 
printf("%d\n%d",a,b);
 
 
 
 
 
	return 0;
}
 
