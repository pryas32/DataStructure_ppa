
class Solution {
public:
    int countPrimes(int n) {
        
if(n==0||n==1)
{
    return 0;
}


   vector<int>arr(n);
   arr[0]=0;
   arr[1]=0;

     
     for(int i=2;i<n;i++)
     {
        arr[i]=1;
     }
      
   
   for(int i=2;i*i<n;i++)
   {
      for(int j=i;j*i<n;j++)
      {
        if(arr[i*j]==1)
        {
            arr[i*j]=0;
        }
      }
   }
      int count=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==1)
        count++;
    }



 return count;


    }
};