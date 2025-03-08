//more optimal determining at the time of inpout in map itself whether it has pair or not  O(n) here 

//pair sum using hashmap 

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
		HashMap<Integer,Integer>m=new HashMap<>();
	int arr[]=new int[n];
	int sum=sc.nextInt();
	boolean flag=true;
	
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		
		if(m.containsKey(sum-arr[i]))
		{
			System.out.println("true");
			flag=false;
			break;
		}
			m.put(arr[i],0);
		
		
	}
	
	if(flag)
	{
		System.out.println("false");
	}
	

	
	}
	
}

