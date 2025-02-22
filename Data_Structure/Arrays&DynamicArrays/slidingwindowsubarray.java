// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

//sliding window subarray-sum
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       int n=sc.nextInt();
       List<Integer>l=new ArrayList<>(n);
       for(int i=0;i<n;i++)
       {
           l.add(sc.nextInt());
       }
       
       int k=sc.nextInt();
       //sum of each subarray of size K;
       
        int sum=0;
       if(k>l.size())
       {
       System.out.println("Not Possible");
       }
       
       
      
       for(int i=0;i<k;i++)
       {
           sum+=l.get(i);
       }
       
       for(int i=k;i<l.size();i++)
       {
           System.out.println(sum);
           
           sum=sum-l.get(i-k);
           sum+=l.get(i);
       }
       
       
       System.out.println(sum);
       
       
       
       
       
       
       
    }
}
