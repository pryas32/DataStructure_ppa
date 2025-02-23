/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//finding divisors of n 
		//using optimized approach
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//simple approach
		
		
	
	//Seieve Of Eratholoses(O(N(log(log(n))); 
	
	int arr[]=new int[n+1];
	
	
	for(int i=0;i<=n;i++)
	{
		arr[i]=1;
	}
	
	
	arr[1]=0;
	
	
	
	for(int i=2;i*i<=n;i++)
	{       
		 if(arr[i]==0)
		 continue;
		for(int j=i;j*i<=n;j++)
		{
			if((i*j)%i==0)
			{
				arr[i*j]=0;
			}
		}
	}
	
	
	for(int i=1;i<=n;i++)
	{
		if(arr[i]==1)
		{
			System.out.println("Yes its prime"+i);
		}
	}
	
	
	
	
	
	
	
	
		
		
		
		
	}
}
