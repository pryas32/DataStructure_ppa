/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


//distinct path from i=m-1 and j=n-1 to i=0 j=0 


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//print from 
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		int x=3,y=3;
		System.out.println(distinctpath(x-1,y-1));
	}
	
	
	
	public static int distinctpath(int i,int j)
	{
		
		if(i==0||j==0)
		{
			return 1;
		}
		
	return	distinctpath(i-1,j)+distinctpath(i,j-1);
		
	}
	
	
	
	
}
