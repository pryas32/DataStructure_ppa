#include <stdio.h>

int main(void) {


//insertion sort -> best for sorted array as we have break condition directly check amd break the loop in this we considered there is a sorted array ans compare next eleement with previous one .


int n;
scanf("%d",&n);


int arr[1000];

for(int i=0;i<n;i++)
scanf("%d",&arr[i]);



for(int i=0;i<n-1;i++)
{
	for(int j=i+1;j>0;j--)
	{
		if(arr[j]<arr[j-1])
		{
			int temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
		}else{
			break;
		}
	}
}

for(int i=0;i<n;i++)
printf("%d",arr[i]);
	return 0;
}
