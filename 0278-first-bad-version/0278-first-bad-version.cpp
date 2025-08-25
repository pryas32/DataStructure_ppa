// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        
        long  firstindex=firstbad(n,1,n);
              
      return (int)firstindex;

    }

  long  firstbad( long n, long  start, long  end)
  {
       while(start<=end)
       {
           long mid=(start+end)/2;

         if(!isBadVersion(mid))
         {
            start=mid+1;
         }
         else if(isBadVersion(1))
         {
             return 1;
         }
          else if((isBadVersion(n)) && (!isBadVersion(n-1)))
         {
            return n;
         }
         else if( (isBadVersion(mid)) && (isBadVersion(mid-1)))
         {
            end=mid-1;
         }else
         {
            return mid;
         }

       }

       return 0;
  }



};