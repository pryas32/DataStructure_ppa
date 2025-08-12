class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
           
           int great=INT_MIN;
           for(int i=0;i<candies.size();i++)
           {
               great=max(candies[i],great);
           }
                  vector<bool>greatest;
               for(int i=0;i<candies.size();i++)
               {
                if(candies[i]+extraCandies>=great)
                {
                        greatest.push_back(1);
                }
                else{
                     greatest.push_back(0);
                }
               }   
         return greatest;





    }
};