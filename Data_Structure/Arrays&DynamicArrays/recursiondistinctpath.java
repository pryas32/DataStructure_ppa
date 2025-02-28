/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

distinct path recursive code from 0,o to m-1,n-1(total path )


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//print from 
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		int x=0,y=0;
		System.out.println(distinctpath(x,y));
	}
	
	
	
	public static int distinctpath(int i,int j)
	{
		
		if(i==2||j==2)
		{
			return 1;
		}
		
	return	distinctpath(i+1,j)+distinctpath(i,j+1);
		
	}
	
	
	
	
}
