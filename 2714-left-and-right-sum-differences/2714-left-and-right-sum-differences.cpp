class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
          
          int leftlen=nums.size();
          
          vector<int>left(leftlen);

          for(int i=1;i<leftlen;i++)
          {
              left[i]=left[i-1]+nums[i-1];
          }

   





      int rightlen=nums.size();
          
          vector<int>right(rightlen);

          for(int i=rightlen-2;i>=0;i--)
          {
              right[i]=right[i+1]+nums[i+1];
          }



     for(int i=0;i<leftlen;i++)
     {
        nums[i]=abs(left[i]-right[i]);
     }


return nums;


    }
};