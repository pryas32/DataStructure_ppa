#include <stdio.h>

int main(void) {



//inserting at particular index


int n;
scanf("%d",&n);

int arr[10];


for(int i=0;i<n;i++)
{
	scanf("%d",&arr[i]);
}


int x,i;
scanf("%d%d",&x,&i);




for(int i=n-1;i>=x;i--)
{
	arr[i+1]=arr[i];
}



arr[x]=i;



for(int i=0;i<6;i++)
{
	printf("%d\n",arr[i]);
}



	return 0;
}
