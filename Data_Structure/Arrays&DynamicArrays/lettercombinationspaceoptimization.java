#include <iostream>
#include<bits/stdc++.h>
#include<string.h>
using namespace std;
//letter combination using recursion
//space optimization as there is pass by value here 

void printcombination(char ch[],int i,vector<vector<char>> &v,string &str){
	
	
	if(i==str.length())
	{
		int len=strlen(ch);
		
		for(int i=0;i<len;i++)
		{
		cout<<ch[i];
	}
	
	cout<<endl;
		return ;
	}
	
	
	
	for(int j=0;j<v[str[i]-'2'].size();j++)
	{
		ch[i]=v[str[i]-'2'][j];
		printcombination(ch,i+1,v,str);
		
		
	}
	
	
	
}






int main() {

string str;
cin>>str;

if(str.size()==0)
{
	cout<<"Empty String"<<endl;
	return 0;
}


int i=0;

char ch[str.length()+1];



vector<vector<char>> v;

    // Pushing each row into the vector using push_back()
    v.push_back({'a', 'b', 'c'});  // 2
    v.push_back({'d', 'e', 'f'});  // 3
    v.push_back({'g', 'h', 'i'});  // 4
    v.push_back({'j', 'k', 'l'});  // 5
    v.push_back({'m', 'n', 'o'});  // 6
    v.push_back({'p', 'q', 'r', 's'}); // 7
    v.push_back({'t', 'u', 'v'});  // 8
    v.push_back({'w', 'x', 'y', 'z'});  // 9




printcombination(ch,i,v,str);
};








