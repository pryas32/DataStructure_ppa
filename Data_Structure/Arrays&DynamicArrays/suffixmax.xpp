#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){

int n;
cin>>n;
int arr[n];


for(int i=0;i<n;i++)
cin>>arr[i];



///suffix min

int maximum[n];


for(int i=0;i<n;i++)
maximum[i]=arr[i];


for(int i=n-2;i>0;i--)
{
	maximum[i]=min(maximum[i+1],maximum[i]);
}



int q;

cin>>q;



while(q>0)
{

int r;
cin>>r;


//need to tell maxi from l to r;



cout<<maximum[r]<<endl;//O(1)









q--;

}

	return 0;
}
