class Solution {
public:
    vector<string> vtr; 
    vector<string> letterCombinations(string digits) {
        if (digits.empty()) return vtr;

        vector<string> digitsum(10);   
        digitsum[2] = "abc";
        digitsum[3] = "def";
        digitsum[4] = "ghi";
        digitsum[5] = "jkl";
        digitsum[6] = "mno";
        digitsum[7] = "pqrs";
        digitsum[8] = "tuv";
        digitsum[9] = "wxyz";

        string str;
        int i = 0;
        recursive(str, digitsum, digits, i);  
        return vtr;
    }

    void recursive(string str, vector<string> &digitsum, string &digits, int i1) {
        if (i1 == digits.size()) {  
            vtr.push_back(str);
            return;
        }

        string letters = digitsum[digits[i1] - '0'];
        for (int j = 0; j < letters.size(); j++) {
            recursive(str + letters[j], digitsum, digits, i1 + 1);
        }
    }
};
