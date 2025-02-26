//finding pair which is divisible by n 


//O(N+K)




/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc=new Scanner(System.in);
      
      int T=sc.nextInt();
      
      while(T>0)
      {
          
          int n=sc.nextInt();
          
          
          int arr[]=new int[n];
          
          for(int i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
          }
          
          
          
          int count[]=new int[4];
          
          
          for(int i=0;i<4;i++)
          {
              count[i]=0;
          }
          
          
          for(int i=0;i<n;i++)
          {
              count[arr[i]%4]++;
          }
          
          
          int ans=0;
          
          
          ans+=((count[0])*(count[0]-1))/2;
          
          
          for(int i=1;i<=4/2-1;i++)
          {
              ans+=count[i]*count[4-i];
          }
          
              ans+=(count[2]*(count[2]-1))/2;
        
          
          
         System.out.println(ans);
          
          
          T--;
      }
      
      
      
      
      
      
      
      
      
       
       
       
       
       
           }
}
