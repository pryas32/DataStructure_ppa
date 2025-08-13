class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
int m=matrix.size()-1;
int n=matrix[0].size()-1;


    if(m==-1 || n==-1)
    {
        return false;
    }


     int i=0;
     int j=n;

    while(i<=m && i>=0  && j>=0 && j<=n)
    {
        if(matrix[i][j]>target)
        {
              j=j-1;
        }
        else if(matrix[i][j]<target){
              i=i+1;
        }
        else{
            return true;
        }
    }

   return false;


    }
};