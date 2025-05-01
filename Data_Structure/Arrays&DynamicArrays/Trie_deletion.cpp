#include <iostream>
using namespace std;

int main() {
//deletion in trie

//took root as " " (empty string)//took found=false as global variable
deletion(string & word,pos,root)
{
	if(root==NULL)//means there is no such string with this word;
	{
		return;
	}
	
	
	if(word.size()==pos) //there will be two cases either we are at the string or are in between the end;
	{
		if(root->end==true)//represrnt that there is string where we ended
		{
			root->count--;
			root->end=false;
			found=true;
		}
	}
	
	
	deletion(word,pos+1,root->children[word[pos]-'a']);
	
	if(found)
	{
		root->count--;
		
		if(root->children[word[pos]-'a']->count==0){
		
		Node *temp=root->children[word[pos]-'a'];
		
		root->children[word[pos]-'a']=NULL;
		delete(temp);
	}
	}
	
	
	
	
	
	
	
	
}








	return 0;
}
