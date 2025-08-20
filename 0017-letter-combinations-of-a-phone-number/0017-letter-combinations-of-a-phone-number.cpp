class Solution {
public:
    vector<string>vtr; 
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

      
        int i = 0;
       
      int len=digits.size();

      vector<char>str(len);
       
         recursive(str, digitsum, digits, i);  
        return vtr;
    }
//now using same character array how we will proceed
    void recursive(vector<char> str, vector<string> &digitsum, string &digits, int i1) {
        if (i1 == digits.size()) {  
         vtr.push_back(string(str.begin(), str.end()));

            return;
        }

        string letters = digitsum[digits[i1] - '0'];
        for (int j = 0; j < letters.size(); j++) {
            str[i1]=letters[j];
            recursive(str ,digitsum, digits, i1 + 1);
        }
    }
};
