#include <stdio.h>

int main(void) {

//nested loop -> loop inside the loop is known as nested loop.

int n;
scanf("%d",&n);



//multiple shouldnt be printed


for(int i=2;i<=n;i++)
{
	if(n%i==0)
	{
		continue;
	
	}
	
	
		printf("%d",i);
}










}
