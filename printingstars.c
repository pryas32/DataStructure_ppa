#include <stdio.h>

int main(void) {

//printing odd and even;


int n;
scanf("%d",&n);


int i=1;

while(i<=n)
{
	int j=1;
	while(j<=i)
	{
		printf("*");
		j++;
	}
	printf("\n");
	i++;
}












	return 0;
}
