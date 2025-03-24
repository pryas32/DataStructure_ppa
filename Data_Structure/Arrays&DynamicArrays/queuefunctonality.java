//queue functionality

import java.util.*;
class queue{
	
	public static void main(String args[])
	{
		Queue<Integer>q=new ArrayDeque<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		//int q1=q.front();
		
		
	//	System.out.println(q1);
		
		int t1=q.remove();
		
		System.out.println(t1);
		
		System.out.println(q.size());
		
		
	}
	
	
	
	
}
