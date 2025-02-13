#include <stdio.h>

int main(void) {

//special series

//1/1+1/(1+1)+1/(1+2)+1/(1+3)

int n;
scanf("%d",&n);

double sum=0.0,count=0.0;
int i=0;
while(i<n)
{
sum=((1.0)/(i+1));
count=count+sum;
printf("%lf",sum);
printf("\n");
i++;
}




printf("%lf",count);







}
