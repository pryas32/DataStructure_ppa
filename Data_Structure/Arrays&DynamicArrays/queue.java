//printing no starting with only 1,2,3 in sorted order

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	//given n print first n natural numbers
	
	Queue<Integer>q=new LinkedList<>();
	q.offer(0);
	
	int count=0;
	
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	 while(count<=n)
	 {
	 	int T =q.peek();
	     
	     if(T!=0)	{
	 	System.out.println(T);
	 	count++;
	     }
	 	q.poll();
	 	
	 	
	 	if(T>n)
	 	{
	 		break;
	 	}
	 	
	 	
	 	q.offer(10*T+1);
	 	q.offer(10*T+2);
	 	q.offer(10*T+3);
	 	
	 }
	
	
	
	
	
	
	
	
	
	}
}
