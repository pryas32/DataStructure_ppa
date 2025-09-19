class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        deque<int>d;
        vector<int>ans;


       for(int i=0;i<k;i++)
       {
          insert(d,nums,i);
       }
           

          for(int i=k;i<nums.size();i++)
    {
          ans.push_back(nums[d.front()]);

          if(d.front()==i-k)
          {
            d.pop_front();
          }

          insert(d,nums,i);
    }


    ans.push_back(nums[d.front()]);

    
    return ans;


    }


       void insert(deque<int>&d,vector<int>& nums,int idx)
       {
             while(!d.empty()  && nums[idx]>=nums[d.back()])
             {
                d.pop_back();
             }

             d.push_back(idx);
       }






};