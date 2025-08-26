class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int len=nums.size()-1;

        if(len==0)
        {
            return nums[0];
        }

               int start=0;
                  while(start<=len)
                  {
                    int mid=(start+len)/2;
                  
                  if(mid==0)
                  {
                    if(nums[mid]!=nums[mid+1])
                    {
                        return nums[mid];
                    }
                  }
                  else if(mid==len)
                  {
                    if(nums[mid]!=nums[mid-1])
                    {
                        return nums[mid];
                    }
                  }
                  else if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                  {
                    return nums[mid];
                  }
                  else {
                    int fo,so;

                       if(nums[mid]==nums[mid-1])
                       {
                        fo=mid-1;
                        so=mid;
                       }
                       else 
                       {
                        fo=mid;
                        so=mid+1;
                       }
                        if(fo%2==0)
                        {
                            start=mid+1;
                        }else {
                            len=mid-1;
                        }

                       }
                  }
return 0;
    }
};






