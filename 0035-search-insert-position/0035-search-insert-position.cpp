class Solution {
public: 
     int index=-1;
    int searchInsert(vector<int>& nums, int target) {
        
  int lastindex=nums.size()-1;
int start=0;

            while(start<=lastindex)
        {
               int mid=(start+lastindex)/2;

                       if(nums[mid]==target)
                       {
                        return mid;
                       } 


               if(nums[mid]>target)
               {
                lastindex=mid-1;
               }
               else{
                start=mid+1;
               
               }

   }


return start;
    }
};