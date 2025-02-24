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
	
	int prime[]=new int[n+1];
	int spf[]=new int [n+1];
	
	
	for(int i=0;i<=n;i++)
	{
		prime[i]=0;
		spf[i]=i;
	}
	
	
	prime[0]=-1;
	
	
	for(int i=2;i*i<=n;i++)
	{
		if(prime[i]==0)
		{
			for(int j=i;i*j<=n;j++)
			{
				if(i*j%i==0  && prime[i*j]!=-1)
				{
					prime[i*j]=-1;
					
				
					
					spf[i*j]=i;
				}
			}
		}
	}



	for(int i=0;i<=n;i++)
	{
	//	prime[i]=0;
	System.out.print(i+" "+spf[i]);
		System.out.print(" ");
	}



		
	}
}
