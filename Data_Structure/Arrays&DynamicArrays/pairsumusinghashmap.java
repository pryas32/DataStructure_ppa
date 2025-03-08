//pair sum using hashmap 
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
	
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	
	HashMap<Integer,Integer>m=new HashMap<>();
	
	for(int i=0;i<n;i++)
	{
		m.put(arr[i],m.getOrDefault(arr[i],0)+1);
	}
	
	boolean flag=true;
	int sum=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	
		int remainder=(sum-arr[i]);
		if((m.containsKey(remainder)))
		{
			
			if((remainder==arr[i]) && m.get(remainder)>1)
			{
			System.out.println("true");
			flag=false;
			break;
		}
		else if(remainder!=arr[i])
		{
			System.out.println("true");
			flag=false;
			break;
		}
}
	
	}
	
	if(flag)
	{
		System.out.println("false");
	}
	
	
	
	
	}
	
}
