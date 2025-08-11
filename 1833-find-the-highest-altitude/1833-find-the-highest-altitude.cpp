class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int n=gain.size();
            vector<int>v(n+1);
         int max=v[0];
        for(int i=1;i<=gain.size();i++)
        {
            v[i]=gain[i-1]+v[i-1];
            if(max<v[i])
            {
                max=v[i];
            }
        }

return max;


    }
};