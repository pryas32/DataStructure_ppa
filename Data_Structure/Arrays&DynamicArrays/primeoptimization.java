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
		
		
		int count=0;
		
		
		for(int i=2;i*i<=n;i++)  //TC O(N/2)
		{
			
			if(n%i==0)
			{
				count++;
			}
		
		}
		
		if(count==0){
			System.out.println("Yes its prime"+n);
		}
		else{
			System.out.println("Not a prime"+n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
