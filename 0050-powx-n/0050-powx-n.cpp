class Solution {
public:
    double answer=1.0;
    double myPow(double x, long  n) {
        
  
       



     if(n==0)
     {
         return answer;
     }

if(n<0)
{
    n=-(n);
    x=(1*1.0/x);
}

     double ans=power(x,n/2);
      if(n%2==0)
              {
                return ans*ans;
              } 
              else{
                return ans*ans*x;
              }     
  

    }

   double power(double x,int n){
                  

   if(n==0)
   {
    return 1.0;
   }

     if(n%2==0)
     {
    double  answers=power(x,n/2);
     return answers*answers;
   
     }
     else{
     double  valid=power(x,n/2);
       
        return  valid*valid*x;
     }
   }
};