#include <stdio.h>

int main(void) {



//for breaking infinite loop



int i=1;

while(1)
{
	i++;
	printf("%d",i);
	
	if(i==5)
	{
		break;
	}
	
	
}







	return 0;
}
