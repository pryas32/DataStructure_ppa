class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        
    int len=nums.size()-1;

    int i=0;

int count=0;
    while(i<=len)
    {
        if(nums[i]!=0)
        {
            if(i!=count)
            {
                swap(nums[i],nums[count]);
               
            }
             count++;
        }
        i++;
    }






    }
};