//maximizeexpression

#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){

int n;
cin>>n;
int arr[n];


for(int i=0;i<n;i++)
cin>>arr[i];



int preffixmax[n];


for(int i=0;i<n;i++)
preffixmax[i]=arr[i];


for(int i=1;i<n;i++)
{
	preffixmax[i]=max(preffixmax[i-1],preffixmax[i]);
}

int suffixmax[n];


for(int i=0;i<n;i++)
suffixmax[i]=arr[i];



for(int i=n-2;i>=0;i--)
{
	suffixmax[i]=max(suffixmax[i+1],suffixmax[i]);
}






int q;
cin>>q;

while(q--)
{
int p,q1,r;
cin>>p>>q1>>r;



int sum=INT_MIN;

  for(int i=1;i<n-1;i++)
  {
  	sum=max(sum,p*preffixmax[i-1]+q1*arr[i]+r*suffixmax[i+1]);
  }



cout<<sum<<endl;



}

	return 0;
}
