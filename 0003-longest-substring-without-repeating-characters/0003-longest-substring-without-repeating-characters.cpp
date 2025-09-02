class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int freq[256] = {0};
        int i = 0, j = 0, maxLen = 0;
        int n = s.length();

        while (j < n) {
          
            if (freq[s[j]] == 0) {
                freq[s[j]]++;
                maxLen = max(maxLen, j - i + 1);
                j++;
            } else {
                
                freq[s[i]]--;
                i++;
            }
        }

        return maxLen;
    }
};
