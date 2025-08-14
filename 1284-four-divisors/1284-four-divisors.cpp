class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        
   int sum=0;
   for(int i=0;i<nums.size();i++)
   {
       int n=nums[i];
     int n1=sqrt(n);
      int count=0;
       int summation=0;
     if(n1*n1==n)
     {
        continue;
     }
      
     for(int i=1;i*i<n;i++)
     {
        if(n%i==0)
        {
            count+=2;
            summation+=i;
            int rem=n/i;
            summation+=rem;
        }
        
        if(count>4)
        {
            break;
        }




     }


     if(count==4)
{
    sum+=summation;
}
   }


 return sum;
 
 
 
 
 }
   

       
       


};