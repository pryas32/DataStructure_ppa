

bool cmp(pair<int,int>p1,pair<int,int>p2)
{
    if(p1.first!=p2.first)
    {
        return p1.first<p2.first;
    }

    return p1.second<p2.second;
}










class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
    
    vector<pair<int,int>>v1;

    for(int i=0;i<=nums.size()-1;i++)
    {
        v1.push_back({nums[i],i});
    }


sort(v1.begin(),v1.end(),cmp);


vector<int>v;
int i=0;
    int j=v1.size()-1;

    while(i<j)
    {
        if(v1[i].first+v1[j].first==target)
        {
         int index1=v1[i].second;
         int index2=v1[j].second;
         v.push_back(index1);
         v.push_back(index2);
          i++;
          j--;
          break;
        }
        else if(v1[i].first+v1[j].first<target)
        {
            i++;
        }
        else{
            j--;
        }
    }
return v;





    }
};