/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//trouble sort ->used for sorting odd and even index element seperately.

//here its O(N^2) time complexity but when applyinge merge sort it will take O(nlogn) time complexity .

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//trouble sort
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		boolean flag=true;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n-3;j++)
			{
				if(arr[j]>arr[j+2])
				{
					int temp=arr[j];
					arr[j]=arr[j+2];
					arr[j+2]=temp;
					flag=false;
				}
			}
			
			
			
			
			if(flag)
			{
				break;
			}
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
	}
}
