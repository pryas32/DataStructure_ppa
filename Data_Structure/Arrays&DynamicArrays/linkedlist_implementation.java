/* package whatever; // don't place package name! */
//linkedlist implementation .
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 class node{
	Integer data;
	node next;
	
	node(Integer x)
	{
		this.data=x;
		this.next=null;
	}
	
	
	
}


class LinkedList{
	
	
private	node head=null;
private node tail=null;	
	
	public void insert(Integer x){
		if (head==null)
		{
			head=new node(x);
		tail=head;
		}
		else{
		node  temp=new node(x);
		tail.next=temp;
		tail=tail.next;
		
		}
		
	}

	
	public node delete(Integer x)
	{
		node  temporary=head;
		if(head==null)
		{
			System.out.println("Cant delete empty linkedList");
			return  head;
		}
		
		
			if(temporary.data.equals(x))
		{
			head=head.next;
			return head;
		}
		
		
		while(temporary.next!=null && !temporary.next.data.equals(x))
		{
		 temporary=temporary.next;	
		}
		
		
		
		if(temporary==null)
		{
			System.out.println("Not possible to delete");
			return head;
		}
		else{
			temporary.next=temporary.next.next;
			return head;
		}
		
		
		
		
		
		
	}
	
	
	
	public void display(){
		if(head==null)
		{
			System.out.println("Empty Linked List");
		}
		else{
			node tem=head;
			while(tem!=null)
			{
				System.out.println(tem.data);
				tem=tem.next;
			}
		}
		
		
		
		
		
		
	}
	
public static void main(String args[])
{
	
	LinkedList l=new LinkedList();
	l.insert(123);
	l.insert(23);
	l.insert(45);
	l.insert(56);
node  left=l.delete(123);
	
	
	if(left==null)
	{
		System.out.println("Empty linkedList");
	}
	
	
	
	
	l.display();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}





