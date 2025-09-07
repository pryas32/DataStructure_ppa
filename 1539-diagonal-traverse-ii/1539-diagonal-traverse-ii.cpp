class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
         int row = nums.size();
        if (row == 0) return {};
        

        map<int, vector<int>> m;

        // Collect elements by diagonals
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums[i].size(); j++) {
                int k = i + j;
                m[k].push_back(nums[i][j]);
            }
        }

        vector<int> v;

       
 auto it=m.begin();




            while(it!=m.end())
            {
                reverse(it->second.begin(), it->second.end());
            for (int val : it->second) {
                v.push_back(val);
            }
            it++;
        }

        return v;






       
       

  








    }
};