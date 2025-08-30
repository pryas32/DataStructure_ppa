class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {

        int len=nums.size();

        vector<int>square;


        int index;
        for(int i=0;i<len;i++)
        {
            if(nums[i]>=0)
            {
                 index=i;
                 break;    
            }
        }

               int j=index-1;
            int k=index;

          while(j>=0 && k<=len-1)
           {
              int a=nums[j]*nums[j];
              int b=nums[k]*nums[k];

            if(a<=b)
            {
                square.push_back(a);
                j--;
            }
            else{
                square.push_back(b);
                k++;
            }
            
           }


           while(j>=0)
           {
            square.push_back(nums[j]*nums[j]);
            j--;
           }
           while(k<=len-1)
           {
            square.push_back(nums[k]*nums[k]);
            k++;
           }


           return square;

        
    }
};