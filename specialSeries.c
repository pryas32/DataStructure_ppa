#include <stdio.h>

int main(void) {


int x,n;
scanf("%d%d",&x,&n);
float summation=0.0;

int ans=1,den=1;
for(int i=0;i<=n;i++)
{
	summation+=(ans/den);
	ans=ans*x;
	den=den*(i+1);
	
}

printf("%f",summation);

	return 0;
}
