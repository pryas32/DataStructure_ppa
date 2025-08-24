class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int>v;

int firstindex=-1;
int lastindex=-1;

int start=0;
int end=nums.size()-1;

                while(start<=end)
                {
                  int mid=(start+end)/2;
                if(nums[mid]<target)
                {
                    start=mid+1;
                }
               else if(nums[mid]>target)
               {
                end=mid-1;
               }
              else{
                    if(mid==0 && nums[mid]==target)
                    {
                        firstindex=mid;
                       break;
                    }
                    else if(nums[mid-1]!=target)
                    {
                        firstindex=mid;
                       break;
                    }
                    else{
                        end=mid-1;
                    }


              }


                }

start=0;
end=nums.size()-1;
                 while(start<=end)
                {
                  int mid=(start+end)/2;
                if(nums[mid]<target)
                {
                    start=mid+1;
                }
               else if(nums[mid]>target)
               {
                end=mid-1;
               }
              else{
                    if(nums[mid]==target && mid==end)
                    {
                        lastindex=mid;
                       break;
                    }
                    else if(nums[mid+1]!=target)
                    {
                        lastindex=mid;
                        break;
                    }
                    else{
                        start=mid+1;
                    }
              }
         }


   v.push_back(firstindex);
   v.push_back(lastindex);
return v;





    }
};