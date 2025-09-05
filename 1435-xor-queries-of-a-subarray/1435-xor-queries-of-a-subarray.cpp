class Solution {
public:
    vector<int> xorQueries(vector<int>& arr, vector<vector<int>>& queries) {
       
       int n=arr.size();

       vector<int>v(n);
       v[0]=arr[0];
         vector<int>result;
      for(int i=1;i<n;i++)
      {
        v[i]=v[i-1]^arr[i];
      }

       for(int j=0;j<queries.size();j++)
       {
         for(int k=0;k<queries[j].size()-1;k++)
         {
            int left=queries[j][k];
            int right=queries[j][k+1];

           if(left==0)
           {
              result.push_back(v[right]);
           }
           else{
            result.push_back(v[right]^v[left-1]);
           }

         }
       
       }


       return result; 

    }
};