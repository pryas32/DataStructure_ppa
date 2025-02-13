#include <stdio.h>
#include<math.h>

int main(void) {
//math.h ->its used to include functions like pow(x,y); where y can be int as well as float value also 

//floor();->lower as well as equal value can take int as well as float;
//ceil();->greater or equal to value;

//fabs()->distance from the 0 point its applicable for floating point number .


int a=2.4;

int x=floor(2.4);
int y=ceil(2.4);


int z=pow(2,2.5);
int w=pow(2,2);



float a1=fabs(-2.5);//distance from the zero point .it will always be positive.


printf("%d\n%d\n%d\n%d\n%f",x,y,z,w,a1);














}
