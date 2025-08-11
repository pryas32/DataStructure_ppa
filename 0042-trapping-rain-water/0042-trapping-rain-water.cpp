class Solution {
public:
    int trap(vector<int>& height) {
         
        int len1=height.size();
    vector<int>height1(len1);

   vector<int>height2(len1);

for(int i=0;i<len1;i++)
{
    height1[i]=height[i];
    height2[i]=height[i];
}




   for(int i=1;i<len1;i++)
   {
    height1[i]=max(height1[i-1],height1[i]);
   }


  for(int i=len1-2;i>=0;i--)
   {
    height2[i]=max(height2[i],height2[i+1]);
   }

int amount=0;
     for(int i=1;i<len1-1;i++)
     {
          int totalheight=min(height1[i-1],height2[i+1]);

       if(totalheight>height[i])
       {
        amount+=(totalheight-height[i]);
       }


     }

     return amount;

















    }
};