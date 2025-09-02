class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        
       sort(nums.begin(),nums.end());

    vector<vector<int>>res;

   int len=nums.size()-1;

   for(int i=0;i<=len-3;i++)
   {
     if(i>0 && nums[i]==nums[i-1])
     {
        continue;
     }

    for(int j=i+1;j<=len-2;j++)
    {
        if(j!=i+1 && nums[j]==nums[j-1])
        {
            continue;
        }
       
      int pointer1=j+1;
      int pointer2=len;
       long sum=nums[i]+nums[j];
       long  targetelement=(target-sum);

      while(pointer1<pointer2)
      {
        if(nums[pointer1]+nums[pointer2]<targetelement)
        {
            pointer1++;
        }
        else if(nums[pointer1]+nums[pointer2]>targetelement)
        {
            pointer2--;
        }
        else{
            res.push_back({nums[i],nums[j],nums[pointer1],nums[pointer2]});
             if(nums[pointer1]==nums[pointer2])
             {
                break;
             }
           int x=nums[pointer1];
            while(nums[pointer1]==x)
            {
                pointer1++;
            }

            int y=nums[pointer2];
              while(nums[pointer2]==y)
            {
                pointer2--;
            }

    
        }
      }



    }
    





   }
return res;








    }
};