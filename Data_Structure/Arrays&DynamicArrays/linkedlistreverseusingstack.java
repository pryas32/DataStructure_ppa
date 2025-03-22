//reverse linkedlist using stack


import java.util.*;
//reversing linkeedlist using stack O(n) space complexity and O(n) time complexity
class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
}

class linkedlist{
	private Node head=null;;
	private Node tail=null;
	
	public void insert(int x)
	{
	
		if(head==null)
		{
			Node temp=new Node(x);
			head=temp;
			tail=temp;
			tail.next=null;
		}
		else{
			Node temp=new Node(x);
			tail.next=temp;
			tail=tail.next;
			tail.next=null;
		}
		
		
		
	}
	
	
		public void reverse()
	{
	Stack<Integer> stack = new Stack<>();
	
	Node temp1=head;
	while(temp1!=null)
	{
		stack.push(temp1.data);
		temp1=temp1.next;
	}
	
	Node temp2=head;
while(!(stack.isEmpty()))
{
	int topper=stack.peek();
	temp2.data=topper;
	stack.pop();
	temp2=temp2.next;
	
}
	
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void display()
	{
	
	Node temper=head;
	while(temper!=null)
	{
		System.out.println(temper.data);
		temper=temper.next;
	}
		
		
		
	}
	
	
	
public static void main(String args[])
{
	 linkedlist l=new  linkedlist();
	 l.insert(1);
	 l.insert(2);
	 l.insert(3);
	  l.insert(4);
	 l.insert(5);
	 
	 l.reverse();
	 
	 
	 l.display();
}



	
}
