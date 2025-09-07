// class Solution {
// public:
//     vector<int> findDiagonalOrder(vector<vector<int>>& mat) {


     
//       int row=nums.size();
//       int cols=num[0].size();

//        map<int,vector<int>>m;


//        for(int i=0;i<row;i++)
//        {
//         for(int j=0;j<cols;j++)
//         {
//             int k=i+j;
//          m.insert({k,mat[i][j]);
//         }
//        }

// vector<int>v;
   

//    auto it=m.begin();


//   while(it!=m.end())
//   {
//        int num=it->first;

//        if(num%2!=0)
//        {
//         reverse(it.begin(),it.end());
//         v.push_back(it->second);
//        }
//        else{
//         v.push_back(it->second);
//        }

//        it++;
//   }

    











//     }
// };


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int row = mat.size();
        if (row == 0) return {};
        int cols = mat[0].size();

        map<int, vector<int>> m;

        // Collect elements by diagonals
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                int k = i + j;
                m[k].push_back(mat[i][j]);
            }
        }

        vector<int> v;

       
 auto it=m.begin();




            while(it!=m.end())
            {
            if (it->first % 2 == 0) {
                reverse(it->second.begin(), it->second.end());
            }
            for (int val : it->second) {
                v.push_back(val);
            }
            it++;
        }

        return v;
    }
};
