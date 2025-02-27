/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	//recursion-> in recursion  the highher problem is dependent on smaler problem .
	
	//its a same function calling itself with changing parameter
	
	
	// ..it has two part first is termination condition where the code will stop
	// .. the second one is the recurrence function calling itself with smaller input size .
	
	
	// eg 
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	
	int n1=factorial(n);
	
	System.out.println(n1);
	
	}
	
	
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		
		return factorial(n-1)*n;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
