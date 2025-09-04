class Solution {
public:
    int duplicateNumbersXOR(vector<int>& nums) {
        

       int number=0;

       for(int i=0;i<nums.size()-1;i++)
       {      int count=1;
          for(int j=i+1;j<nums.size();j++)
          {
            if(nums[j]==nums[i])
            {
                count++;
            }
          }

            if(count==2)
            {
                number=(number^nums[i]);
            }


       }


       return number;

    }
};