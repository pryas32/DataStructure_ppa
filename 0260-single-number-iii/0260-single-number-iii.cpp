class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
          
          int len=nums.size();
      
        int number=0;
          for(int i=0;i<len;i++)
          {
            number^=nums[i];
          }

          int mask=1;
        
        while(!(mask & number))
        {
            mask=(mask<<1);
        }
            vector<int>v;
            int val=0;
           for(int i=0;i<len;i++)
           {
             if(nums[i]& mask)
             {
                val=val^nums[i];
               
             }
           }

       v.push_back(val);
       int val2=0;
      for(int i=0;i<len;i++)
           {
             if(!(nums[i]& mask))
             {
                val2=val2^nums[i];
               
             }
           }

v.push_back(val2);
       return v;






    }
};