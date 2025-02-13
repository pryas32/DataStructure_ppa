#include <stdio.h>

int main(void) {

//special series

//1+11+111+1111+.........
//for n=3 1+11+111

int sum=0;
int n;
scanf("%d",&n);

int count=0;
int i=1;
while(i<=n)
{
	sum=sum*10+1;
	count+=sum;
	i++;
}




printf("%d",count);







}
