/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	//kth smallest in an array in O(n^2)
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	
	int K;
	K=sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		int smaller=0;
		for(int j=0;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				smaller++;
			}
		}
		
			int equal=0;
		for(int j=0;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				equal++;
			}
		}
		
		
		if(K<=smaller+equal   && K>smaller)
		{
			System.out.println(arr[i]);
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
