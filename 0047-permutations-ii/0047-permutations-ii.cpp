class Solution {
public:
  vector<vector<int>>v; 
    vector<vector<int>> permuteUnique(vector<int>& nums) {

  int i=0;
int len=nums.size()-1;

   permutation(nums,i,len);
   return v;



    }

void permutation(vector<int>&nums,int index,int &length)
{
    if(index==length)
    {
        v.push_back(nums);
        return ;
    }

      int frequency[21]={0};
     for(int j=index;j<=length;j++)
     {
        if(frequency[nums[j]+10]==0)
        {
        int temp=nums[index];
        nums[index]=nums[j];
        nums[j]=temp;
     permutation(nums,index+1,length);
        int temp1=nums[index];//here we have pushed back as we want to use same nums array back so swapped back to orginal array 
        nums[index]=nums[j];
        nums[j]=temp1;
        }
          frequency[nums[j]+10]++;

     }


}







};

