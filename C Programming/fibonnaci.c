#include <stdio.h>

int main(void) {

//fibonnaci series

//its a sum of previous two terms

//it says like this 

//f(t)=f(t-1)+f(t-2);


//f(0)=0;
//f(1)=1;
int n;

scanf("%d",&n);

int sum=0;
int a=0;
int b=1;


for(int i=2;i<=n;i++)
{
	sum=a+b;
	a=b;
	b=sum;
}



printf("%d",sum);

	return 0;
}
