#include <stdio.h>

int main(void) {

//printing odd and even;


int n;
scanf("%d",&n);




for(int i=2;i<n;i++)
{
	if(n%i==0)
	{
		printf("%d",i);
	}
}





	return 0;
}
