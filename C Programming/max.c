#include <stdio.h>
#include<limits.h>


int main(void) {



//inserting at particular index


int n;
scanf("%d",&n);

long long arr[1000000000];


for(int i=0;i<n;i++)
{
	scanf("%lld",&arr[i]);
}


long long max=LLONG_MIN;



for(int i=0;i<n;i++)
{
	if(max<arr[i])
	{
		max=arr[i];
	}
}




printf("%lld",max);



return 0;
}
