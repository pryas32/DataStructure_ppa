/* package whatever; // don't place package name! */
//frequency of element in subarray using sliding window
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main(String args[])
	{
		
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		
		List<Integer>l=new ArrayList<>(n);
		
		
		for(int i=0;i<n;i++)
		{
			l.add(sc.nextInt());
		}
		
		
		int k;
		
		k=sc.nextInt();
		
		Integer element;
		
		element=sc.nextInt();
		
		
		int count=0;
		for(int i=0;i<k;i++)
		{
			if(l.get(i).equals(element))
			{
				count++;
			}
		}
		
		
		
		for(int i=k;i<l.size();i++){
			
			System.out.println(count);
		
			if(l.get(i-k).equals(element))
			{
					count--;
			}
		
		
			
			
			if(l.get(k).equals(element))
			{
				count++;
			}
			
			
			
		}
		
		
		System.out.println(count);
		
		
		
		
	}
	
}
