/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//printing in reverse order

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//print from 
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
		
		
		System.out.print(n);
		
		System.out.print(" ");
		
		print(n-1);
		return;
		
	}
	
	
	
	
}
