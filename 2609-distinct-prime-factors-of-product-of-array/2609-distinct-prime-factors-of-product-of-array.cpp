class Solution {
public:
    int distinctPrimeFactors(vector<int>& nums) {
          
          int summation=1;

    

       vector<int>arr(1001,1);
       vector<int>spf(1001,-1);

       arr[0]=0;
       arr[1]=0;

        for(int i=2;i*i<=1000;i++)
        {
            for(int j=i;j*i<=1000;j++)
            {
                if(arr[i*j]==1)
                {
                    arr[i*j]=0;
                    spf[i*j]=i;
                }
            }
        }   
              set<int>s;



         for( int i=0;i<nums.size();i++)
         {
          while(spf[nums[i]]!=-1)
           {
            
                s.insert(spf[nums[i]]);
              nums[i]=nums[i]/spf[nums[i]];
              
           }
       if(spf[nums[i]]==-1)
       {
        s.insert(nums[i]);
       }
         }   

return s.size();

    }
};