class Solution {
public:
    int mySqrt(int x) {
        
    long i=1;
    long end=(long)x;

  bool flag=false;

   while(i<=end)
   {
     long mid=(i+end)/2;

      if(mid*mid>x)
      {
        end=mid-1;
      }
      else if(mid*mid<=x)
      {
        if((mid+1)*(mid+1)>x)
        {
            return (int)mid;
        }
        else{
            i=mid+1;
        }
      }

    


   }









return 0;


    }
};