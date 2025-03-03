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
	
	
	
	
	Arrays.sort(arr);
	
	
	
	
	
	//pair summation
	int sum=sc.nextInt();
	
	// for(int i=0;i<n-1;i++)
	// {
	// 	for(int j=i+1;j<n;j++)
	// 	{
	// 		if(arr[i]+arr[j]==sum)
	// 		{
	// 			System.out.println(arr[i]+" "+arr[j]);
	// 		}
	// 	}
	// }
	
	//this will take O(N^2)
	
	//reducing time complexity
	
	
	
	
// for(int i=0;i<n-1;i++)
// {
// 	int remainder=sum-arr[i];
	
	
	
// 	int lower=i+1;
// 	int higher=n-1;
	
	
	
// 	while(lower<=higher)
// 	{
// 		int mid=(lower+higher)/2;
		
// 		if(arr[mid]==remainder)
// 		{
// 			System.out.println(arr[i]+" "+arr[mid]);
// 			break;
// 		}
// 		else if(arr[mid]>remainder)
// 		{
// 			higher=mid-1;
// 		}
// 		else if(arr[mid]<remainder)
// 		{
// 			lower=mid+1;
// 		}
		
// 	}
	
	
	//O(n*logn) as in each iteration logn work doing 
	
	
	//more optimization
	
	
	
	
	//using two pointer
	
	
	
	int i=0;
	int j=n-1;
	
	
	
	while(i<j)
	{
		if(arr[i]+arr[j]==sum)
		{
			System.out.println(arr[i]+" "+arr[j]);
			i++;
			j--;
		}
		else if(arr[i]+arr[j]>sum)
		{
			j--;
		}
		else if(arr[i]+arr[j]<sum)
		{
			i++;
		}
		

		
	}
	
	}
}
	
	
	
	
