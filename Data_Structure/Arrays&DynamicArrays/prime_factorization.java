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
		   //O(sqrt(n));
		int n=sc.nextInt();
		
		
		
		for(int i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
			
				System.out.print(i);
				System.out.print(" ");
					n=n/i;
				
			}
		}
		
		
		if(n!=1)
		{
			System.out.println(n);
		}
		
		
	}
}
