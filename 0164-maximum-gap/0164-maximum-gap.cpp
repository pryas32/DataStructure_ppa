class Solution {
public:
    int maximumGap(vector<int>& nums) {
        int maximum=INT_MIN;
        int minimum=INT_MAX;
int N=nums.size();
  for(int i=0;i<nums.size();i++)
  {
    maximum=max(maximum,nums[i]);
    minimum=min(minimum,nums[i]);
  }
if(nums.size()<2)
{
    return 0;
}

if(maximum==minimum)
{
    return 0;
}

int gap=(maximum-minimum)/(N-1);

if((maximum-minimum)%(N-1)!=0)
{
    gap++;
}

int bucketcount=((maximum-minimum)/gap)+1;

vector<int> maxarray(bucketcount);
vector<int>minarray(bucketcount);


for(int i=0;i<bucketcount;i++)
{
    maxarray[i]=INT_MIN;
    minarray[i]=INT_MAX;
}


for(int i=0;i<N;i++)
{
    int index=(nums[i]-minimum)/gap;
      maxarray[index]=max(nums[i],maxarray[index]);
      minarray[index]=min(nums[i],minarray[index]);
   
}

int prev=INT_MIN;
int ans=0;

for(int i=0;i<bucketcount;i++)
{
    if(minarray[i]==INT_MAX)
    {
        continue;
    }

if(prev==INT_MIN)
{
    prev=maxarray[i];
}
else{
    ans=max(ans,minarray[i]-prev);
    prev=maxarray[i];
}





}

return ans;

}




    }
;