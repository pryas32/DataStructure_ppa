class Solution {
public:
    int singleNumber(vector<int>& nums) {
        
   long  mask=(1L<<31);
     long  summation=0;
   for(int i=31;i>=0;i--)
   {    long sum=0;
     for(int i=0;i<nums.size();i++)
     {
          if(mask&nums[i])
          {
            sum++;
          }

     }


     if(sum%3!=0)
     {
        summation+=mask;
     }

    mask=(mask>>1);

   }
       return (int)summation;








    }
};