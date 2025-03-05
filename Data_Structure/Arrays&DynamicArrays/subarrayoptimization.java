//subarray optimization using two pointer O(n) from O(N^2)



/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
    
    int T=Integer.parseInt(br.readLine().trim());
    
    while(T>0){
        
    String arr[]=br.readLine().trim().split("\\s+");
    
      
      int n=Integer.parseInt(arr[0]);
      
      int sum=Integer.parseInt(arr[1]);
      
      
      int inputarray[]=new int [n];
      
      
      String input[]=br.readLine().trim().split("\\s+");
      
      for(int i=0;i<n;i++)
      inputarray[i]=Integer.parseInt(input[i]);
      
      int i=0;
      int j=0;
      
      boolean flag=true;
      int  current=inputarray[0];
      int summation=0;
      while(i<=j)
      {
      
      if(summation<sum && j<n)
      {
          summation+=inputarray[j];
          j++;
      }
      else if(summation>sum && i<=n-1)
      {
          summation=summation-inputarray[i];
          i++;
      }
      else if(summation==sum){
          System.out.println(i+1+" "+j);
          flag=false;
          break;
      }else {
          i++; 
      }
      
}


if(flag)
{
    int n1=-1;
    System.out.println(n1);
}




T--;

}
}

}
