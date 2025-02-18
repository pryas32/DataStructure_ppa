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


int i1;
scanf("%d",&i1);




for(int i=i1;i<n;i++)
{
	arr[i]=arr[i+1];
}




for(int i=0;i<n-1;i++)
{
	printf("%d\n",arr[i]);
}



	return 0;
}
