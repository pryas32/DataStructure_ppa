hashmap TCS discussion  and etc things relatedf to it hashing ,loadfactor ,hashfactor etc 




/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//other way was this that we could have sort and then would have iterate nlogn+n
		//or we could have sort it and then used binary serach to find element Onlogn)+ O(logn)
		
		
		// this will solve this problem in O(N)+O(Q*1); TC
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int T=sc.nextInt();
		
		while(T>0)
		{
		
		
		
		HashMap<Integer,Boolean>m=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			m.put(arr[i],true);
		}
		
		int n1=sc.nextInt();
		
		
		
		if(m.containsKey(n1))
		{
		System.out.println("yes its present");	
		}
		else{
			System.out.println("not present");
		}
		
		}
		
		T--;
	}
}
