#include <stdio.h>
 
int main(void) {
 
//relational operator >,<,>=,<=
int a=12;
int b=10;
int c=9;
 
if(a>b){
	printf("true");
}else{
	printf("false");
}
 
//== double equal to operator has more preccedence than assignment operator.
 
 
int a1=11;
int b1=10;
int c1=10;
 
 
int x=b1==c1;//as assignment operator has higher precedence over = operator hence ans=1;
 
 
 
printf("%d",x);
 
 
 
 
 
	return 0;
}
 
