//maximum no of persons that can be assigned jobs in O(N*Log(N))

import java.io.*;
import java.util.*;
   TC : O(n)
   SC O(1)


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] arr = new Integer[n];
        Integer [] arr1 = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr1[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        Arrays.sort(arr1);
        
        

      Integer i=arr[0];
      Integer j=arr1[0];
        
        Integer count=0;
        Integer i1=0,j1=0,maximum=0;
        while(i1<arr.length && j1<arr1.length)
        {
        	if(i<=j)
        	{
        		count++;
        			i1++;
        			
        			if(i1<arr.length)
        			{
        		i=arr[i1];
        			}
        	}
        	else{
        		count--;
        			j1++;
        			
        			if(j1<arr1.length){
        			
        		j=arr1[j1];
        			}
        	}
        	
        	
        	maximum=Math.max(maximum,count);
        	
        }
        
        if(i1<arr.length)
        {
        	count=(count+arr.length-1);
        }
        
        
        
        maximum=Math.max(maximum,count);
        
        
        
        System.out.print(maximum);
        
        

       
       
       
       
       
       
    }
}
