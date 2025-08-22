class Solution {
public:
    vector<string> vtr;
    vector<string> generateParenthesis(int n) {
  


       

int size=0;
int left=0;
int right=0;
int i=0;
char str[2*n+1];
str[2*n]='\0';
paranthesis(str,left,right,size,n);

return vtr;




    }

void  paranthesis(char str[],int left, int right,int size,int &n)
{
    if(size==2*n)
    {
       vtr.push_back(string(str));
            return;
        }

   if (left < n) { 
            str[size] = '(';
            paranthesis(str, left+1, right, size+1, n);
        }

        if (right < left) { 
            str[size] = ')';
            paranthesis(str, left, right+1, size+1, n);
        }
     }

};
