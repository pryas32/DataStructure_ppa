#include <stdio.h>
 
int main(void) {
 
 
int a;
int b;
 
 
scanf("%d%d",&a,&b);
 
 
 
float f1=((float)a)/b;
 
 
 printf("%f",f1);
 
 
 
 
float f2=(a*1.0)/b;
 
 
 printf("%f",f2);
 
printf("\n");
 
printf("%f",((float)a)/0);
 
 
 
 
// float c=(a/b);
 
 
// printf("%f",c);
// float c1=(float)(a/b);
// printf("%f",c1);
	return 0;
}
 
