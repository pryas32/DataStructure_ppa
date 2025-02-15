#include <stdio.h>

int main(void) {

int array[1000000];


int n;
scanf("%d",&n);

int arr[n];
for(int i=0;i<n;i++)
{
	scanf("%d",&arr[i]);
}

float sum=0;
for(int i=0;i<n;i++)
{
	printf("%d\n",arr[i]);
	sum+=arr[i];
}



printf("%f",sum/5);









return 0;

}
