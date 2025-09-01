class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        
        int len=numbers.size()-1;
       
        int i=0;
      vector<int>v;
        while(i<len)
        {
            if(numbers[i]+numbers[len]==target)
            {
              v.push_back(i+1);
              v.push_back(len+1);
              return v;

            }
            else if(numbers[i]+numbers[len]>target)
            {
                len--;
            }
            else {
                 i++;
            }



        }







return v;

    }
};