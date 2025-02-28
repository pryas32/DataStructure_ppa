/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//printing from 1 to n in recursive manner


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//print from 1 to n 
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		print(n);
	}
	
	
	
	public static void print(int n)
	{
		
		if(n==0)
		{
			return;
		}
		
		print(n-1);
		
			System.out.print(n);
		
		System.out.print(" ");
		return;
		
	}
	
	
	
	
}
