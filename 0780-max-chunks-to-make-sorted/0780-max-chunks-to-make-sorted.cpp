class Solution {
public:
    int maxChunksToSorted(vector<int>& arr) {
        
        int len=arr.size();

     vector<int>prefixmax(len);
      
      for(int i=0;i<len;i++)
      {
        prefixmax[i]=arr[i];
      }




      for(int i=1;i<len;i++)
      {
        prefixmax[i]=max(prefixmax[i-1],prefixmax[i]);
      }
    
     int count=0;

     for(int i=0;i<len;i++)
     {
        if(prefixmax[i]==i)
        {
      count++;
        }
     }




  return count;

    }
};