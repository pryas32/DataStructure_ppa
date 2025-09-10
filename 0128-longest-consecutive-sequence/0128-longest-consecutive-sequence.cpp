class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_map<int, bool> m;
        unordered_map<int, bool> visited;

      
        for (int num : nums) {
            m[num] = true;
        }

        int ans = 0;

        for (int num : nums) {
            
            if (visited[num]) continue;

          
            if (m.find(num - 1) != m.end()) {
                continue;  
            }

           
            int current = num;
            int length = 0;

            while (m.find(current) != m.end()) {
                visited[current] = true;
                length++;
                current++;
            }

            ans = max(ans, length);
        }

        return ans;
    }
};
