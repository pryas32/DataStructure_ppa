class Solution {
public:
    int findGCD(vector<int>& nums) {
         sort(nums.begin(),nums.end());
     
     int len=nums.size()-1;
     int minimum=nums[0];
  int maximum=nums[len];

    int gcd=1;
   while(maximum%minimum!=0)
      {
        int remainder=maximum%minimum;
         maximum=minimum;
         minimum=remainder;

      }
                     gcd=minimum;


                     return gcd;







    }
};