/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

//isertion at particular index ,deletion at particular index etc ,searching at particular index

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




	public boolean search(Integer x){
		if(head==null)
		{
			return false;
		}
		else{
			node tem=head;
			while(tem!=null && !(tem.data.equals(x)))
			{
				//System.out.println(tem.data);
				tem=tem.next;
			}
			
			
			if(tem==null)
			{
				return false;
			}
			else{
				return true;
			}
			
		}
		
		
		
		
		
		
	}
	
	
	
		public node insertindex(Integer x,Integer index){
		if(head==null && index==0)
		{
			head=new node(x);
			return head;
			
		}
		else if(index==0){
			node tem=head;
			head=new node(x);
			head.next=tem;
			return head;
		
		}
		else {
			int count=1;
			
			node temp=head;
			
			while(temp!=null && count<index)
			{
				temp=temp.next;
				count++;
			}
			
			if(count==index && temp!=null)
			{
				node tem=new node(x);
				tem.next=temp.next;
				temp.next=tem;
				return head;
			}
			else if(temp==null && count==index)
			{
					node tem=new node(x);
				temp=tem;
				temp.next=tem.next;
				return head;
			}
			else{
				return head;
			}
			
			
			
		}
		
		
		
		
		
	}
	
	
		public node deleteindex(Integer index){
		if(head==null && index==0)
		{
			return head;
			
		}
		else if(index==0){
		head=head.next;
			return head;
		
		}
		else {
			int count=1;
			
			node temp=head;
			
			while(temp!=null && count<index)
			{
				temp=temp.next;
				count++;
			}
			
			if(count==index && temp.next!=null)
			{
			temp.next=temp.next.next;
				return head;
			}
			else {
				return head;
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
   System.out.println(l.search(12));
	l.insertindex(2,1);
	
	
	l.display();
	
	System.out.println("____________________________________");
	l.deleteindex(6);
	
		l.display();
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}




