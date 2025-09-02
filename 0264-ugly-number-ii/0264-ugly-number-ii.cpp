class Solution {
public:
    int nthUglyNumber(int n) {
        
        int len=n;
  vector<int>Arr(len);

Arr[0]=1;

   int p1=0;
   int p2=0;
   int p3=0;

  for(int i=1;i<n;i++)
  {
   int val=min(Arr[p1]*2,min(Arr[p2]*3,Arr[p3]*5));
    Arr[i]=val;
    if(val==Arr[p1]*2)
    {
       p1++;
    }
     
    if(val==Arr[p2]*3)
    {
        p2++;
    }

  if(val==Arr[p3]*5)
    {
        p3++;
    }
    
  }
int value=Arr[n-1];

return value;



    }
};