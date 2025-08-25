class Solution {
public:
    int search(vector<int>& nums, int target) {
      int start=0;
     int end=nums.size()-1;
     
if(start==end && nums[start]!=target)
{
    return -1;
}
else if(start==end && nums[start]==target)
{
    return 0;
}



     int len=nums.size()-1;
     int pivotindex=-1;
         while(start<=end)
         {
            int mid=(start+end)/2;





              if(nums[mid]>nums[mid+1])
              {
            pivotindex=mid;
            break;
              }
              else if(nums[mid]<=nums[len]) 
              {
                 end=mid-1;
              }
              else{
                    start=mid+1;
              }  


         }



             if(target<=nums[len])
             {
                start=pivotindex+1;
                end=len;

                 while(start<=end)
                 {
                    int mid=(start+end)/2;

                 if(nums[mid]>target)
                 {
                    end=mid-1;
                 }
                 else if(nums[mid]<target)
                 {
                    start=mid+1;
                 }
                 else{
                    return mid;
                 }


                 }
             }
          else
                {
                   start=0;
                end=pivotindex;

                 while(start<=end)
                 {
                    int mid=(start+end)/2;

                 if(nums[mid]>target)
                 {
                    end=mid-1;
                 }
                 else if(nums[mid]<target)
                 {
                    start=mid+1;
                 }
                 else{
                    return mid;
                 }

                 }
            }




   return -1;



    }
};