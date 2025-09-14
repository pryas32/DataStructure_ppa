class Solution {
public:
    bool isValid(string s) {
        
stack<char>sq;

for(int i=0;i<s.size();i++)
{
   char ch=s[i];
   

   if(ch=='(' || ch=='['|| ch=='{')
   {
    sq.push(ch);
   }
   else{
     if(ch==')')
     {
       if(sq.empty()||sq.top()!='(')
       {
        return false;
       }
       else{
        sq.pop();
       }
     }
     else  if(ch==']')
     {
       if(sq.empty()||sq.top()!='[')
       {
        return false;
       }
       else{
        sq.pop();
       }
     }
     else if(ch=='}')
     {
        if(sq.empty()||sq.top()!='{')
       {
        return false;
       }
       else{
        sq.pop();
       }
     }
     else{
        return false;
     }
     
   }
     

}

if(sq.size()==0)
{
return true;
}
else{
    return false;
}
    }




};