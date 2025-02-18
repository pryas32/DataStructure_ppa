#include <stdio.h>

int main(void) {

//printing odd and even;


int n;
scanf("%d",&n);

int i=1;


while(i<=n)
{
	
	if(i%2==0)
	{
		printf("%d",i);
	}
	i++;
}

printf("____________________________ODD NUMBERS____________________________________________________");


int i1=1;
while(i1<=n)
{
	
	if(i1%2!=0)
	{
		printf("%d",i1);
	}
	i1++;
}








	return 0;
}
