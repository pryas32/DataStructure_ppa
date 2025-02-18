#include <stdio.h>

int main(void) {
int n;

scanf("%d",&n);

int sum=0;
while(n!=0)
{
	int remainder=n%10;
	n=n/10;
	sum=sum*10+remainder;
}


printf("%d",sum);
	return 0;
}
