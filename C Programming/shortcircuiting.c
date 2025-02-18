#include <stdio.h>
 
int main(void) {
	//logical operator ->consisit of relational and logical operator
 
	//realtional has higher precedence than logical operator.
 
 
	int a=10,b=11,c=12;
 
	if(a>b&&b>c){
		printf("false");
	}
	else if(b>a && c>b){
		printf("true");
	}
 
 
 
 
	//short circuiting-> means T&& T=T
	//T &&F=F;
	//F && whatever it is it will give false so no need to check for second condiditon
	//T|whatever it is ,it will give true.
 
 
 
 
	return 0;
}
