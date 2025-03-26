//ArrayDeque or double-Ended-Queue


import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	ArrayDeque<Integer> queue = new ArrayDeque<>();
	queue.offerFirst(1);
	queue.offerLast(2);
 
	while(!queue.isEmpty())
	{
		int x=queue.peekFirst();
		System.out.println(x);
		queue.pollFirst();
	}
 
 
 
	}
}
