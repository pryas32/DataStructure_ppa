class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        
    int n=nums.size();
    vector<int>nums1(n);
     vector<int>nums2(n);

for(int i=0;i<n;i++)
{
    nums1[i]=nums[i];
    nums2[i]=nums[i];
}







    for(int i=1;i<n;i++)
    {
        nums1[i]=nums1[i]+nums1[i-1];
    }
       
       for(int j=n-2;j>=0;j--)
       {
          nums2[j]=nums2[j+1]+nums2[j];
       }

    for(int i=0;i<n;i++)
    {
         if(nums1[i]==nums2[i])
         {
            return i;
         }
    }

return -1;




    }
};