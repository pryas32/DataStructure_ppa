#include <iostream>
#include<bits/stdc++.h>
#include<string.h>
using namespace std;
//letter combination using recursion


void printcombination(string strc,int i,vector<vector<char>> &v,string &str){
	
	
	if(i==str.length()
	)
	{
		cout<<strc<<endl;
		return ;
	}
	
	
	
	for(int j=0;j<v[str[i]-'2'].size();j++)
	{
		printcombination(strc+v[str[i]-'2'][j],i+1,v,str);
		
		
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

string strc="";



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




printcombination(strc,i,v,str);
};








