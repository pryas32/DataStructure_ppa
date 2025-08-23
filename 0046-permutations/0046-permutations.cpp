class Solution {
public:
      vector<vector<int>>v; 
    vector<vector<int>> permute(vector<int>& nums) {
        



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


     for(int j=index;j<=length;j++)
     {
        int temp=nums[index];
        nums[index]=nums[j];
        nums[j]=temp;

     permutation(nums,index+1,length);


        int temp1=nums[index];
        nums[index]=nums[j];
        nums[j]=temp1;



     }


}







};