/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	//segmented seive
	
Integer arr1[]=new Integer[1000001];
	
	
	for(int i=0;i<=1000000;i++)
	{
		arr1[i]=1;
	}

	arr1[0]=0;
	arr1[1]=0;



for(int i=2;i*i<=1000000;i++)
{
	if(arr1[i]==1)
	
	
	for(int j=i*i;j<=1000000;j+=i)
	{
		if(arr1[j]==1)
		{
			arr1[j]=0;
		}
	}
	
	
	
}

ArrayList<Integer>arr=new ArrayList<>();


for(int i=2;i<=1000000;i++)
{
	if(arr1[i]==1)
	{
	arr.add(i);
	}
}
	
	

	int T;
	Scanner sc=new Scanner(System.in);
	T=sc.nextInt();
	
	while(T>0)
	{
		
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		Integer arrar[]=new Integer[b-a+1];//as it will assign by default null value ;so doing arrar[0]=1; will give nullpointerexception 
		
		Arrays.fill(arrar,1);
		
		
		
		
		for(int i=0;arr.get(i)*arr.get(i)<=b;i++)
		{
			int k=(int)Math.ceil(1.0*a/arr.get(i));
			
			
			for(int j=Math.max(k,2);arr.get(i)*j<=b;j++)
			{
				if(	arrar[arr.get(i)*j-a]!=0)
				
				arrar[arr.get(i)*j-a]=0;
			}
			
			
		}
		
		
			
		T--;
	}
		
		
		
		
		
		

	}
}
