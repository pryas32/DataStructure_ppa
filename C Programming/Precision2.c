
#include <stdio.h>
 
 
int main(void) {
 
 
	//double has more precision than float ,float has precision upto 6 decimal number while double has precision upto 14/15 decimal numbers
 
	//long double has more precision than double
 
//after 6 digit float gives us garbage value
 
 
float f1=9.122334;
 
printf("%f",f1);
 
 
 
float f2=3.12234576;
 
printf("%f",f2);
 
 
 
printf("___________________________________________");
 
 
 
 
float f3=3.45341234;
 
 
printf("%0.8f",f3);// will give random garbage value if asked more than precision value
 
 
 
//double give precision upto 14/15 digit 
// and long double gives precision more than double.
 
 
//format specifier for double 
//is  %lf 
 
printf("____________________________________________________");
 
double p=12.233423455612;
 
printf("%0.14lf",p);
 
 
 
 
 
 
 
 
 
}
 
