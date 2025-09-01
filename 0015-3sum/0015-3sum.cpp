class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
     
     sort(nums.begin(),nums.end());
     
         int len=nums.size()-1;
    vector<vector<int>>res;
     for(int i=0;i<=len-2;i++)
     {
           if( i>0 && nums[i-1]==nums[i])
           {
            continue;
           }
           else{
            int p1=i+1;
            int p2=len;
             int sum=(-1)*nums[i];
            while(p1<p2)
            {
                if(nums[p1]+nums[p2]<sum)
                {
                    p1++;
                }
                else if(nums[p1]+nums[p2]>sum)
                {
                    p2--;
                }
                else {
                    res.push_back({nums[i],nums[p1],nums[p2]});
                    if(nums[p1]==nums[p2])
                    {
                        break;
                    }
                    else{
                        int x=nums[p1];
                        int y=nums[p2];

                      while(x==nums[p1])
                      {
                        p1++;
                      }
                        
                         while(y==nums[p2])
                      {
                        p2--;
                      }


                    }
                }
            }
        




           }
     }


     return res;










    }
};