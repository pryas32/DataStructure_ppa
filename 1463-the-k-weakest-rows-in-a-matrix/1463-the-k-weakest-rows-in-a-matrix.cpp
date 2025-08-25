class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        vector<pair<int,int>>v;
      int n=mat.size();
      int m=mat[0].size();

      int target=1;

      for(int i=0;i<n;i++)
      {
             int index=binary(i,0,m-1,0,m-1,target,mat);
              v.push_back({i,index});
                       
        }
      sort(v.begin(), v.end(), [](const pair<int,int>& a, const pair<int,int>& b) {
            if(a.second == b.second)
                return a.first < b.first;  // if equal, sort by row index
            return a.second < b.second;    // otherwise by soldier count
        });

        vector<int> ans;
        for(int i = 0; i < k; i++) {
            ans.push_back(v[i].first);
        }
        return ans;
    }



    int binary(int i,int startingindex,int endingindex,int start,int end,int target,vector<vector<int>> &mat)
    {
         while(start<=end)
         {

        int mid=(start+end)/2;
       
       if(mat[i][mid]<target)
       {
        end=mid-1;
       }
       else if(mat[i][endingindex]==1)
       {
        return endingindex-startingindex+1;
       }
      else if(mat[i][mid+1]==1)
      {
        start=mid+1;
      }
    else{
        return mid-startingindex+1;
    }
  }    
  return 0;
    }
};

