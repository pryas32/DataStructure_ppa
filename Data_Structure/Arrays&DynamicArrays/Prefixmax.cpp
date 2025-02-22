#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){

int n;
cin>>n;
int arr[n];


for(int i=0;i<n;i++)
cin>>arr[i];



///prfixmax//prefixmin;

int maximum[n];


for(int i=0;i<n;i++)
maximum[i]=arr[i];


for(int i=1;i<n;i++)
{
	maximum[i]=max(maximum[i],maximum[i-1]);
}



int q;

cin>>q;



while(q>0)
{

int l,r;
cin>>l>>r;


//need to tell maxi from l to r;



cout<<maximum[r]<<endl;









q--;

}

	return 0;
}
