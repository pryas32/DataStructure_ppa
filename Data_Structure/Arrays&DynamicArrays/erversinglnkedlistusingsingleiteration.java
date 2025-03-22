//reversing linkedlist using single iteration

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
	
	
		public void reverse(){
Node prev=null;
Node current=head;
Node temp=head;

while(temp!=null)
{
	temp=current.next;
	current.next=prev;
	prev=current;
	current=temp;

}

	head=prev;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	//reversing using single iteration in linkedlist 
	
	
	
	
	
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
