//queue implementation 


class queue<T>{
	Object arr[]=new Object [10];
	 int front ,tail;
	 int count;
	 
	 queue()
	 {
	 	front=0;
	 	tail=0;
	 	count=0;
	 }
	 
	public void push(T x){
		if(count==10)
		{
			System.out.println("Overflow condition");
			return;
		}
		
		arr[tail]=x;
	    tail=(tail+1)%10;
		count++;

	}
	
	public T pop(){
		
		if(count==0)
		{
			System.out.println("Underflow condition");
			return null;
		}
		
		
		T x=(T) arr[front]; //here return as object which typecasted to particular data type 
		front=(front+1)%10;
		count--;
		return x;
		
	}
	
	
	public int size(){
		return count;
	}
	
	public boolean Empty(){
		return count==0;
	}
	
public static void main(String args[]){
	
	queue<Integer>q=new queue<Integer>();
	q.push(1);
	q.push(2);
	q.push(3);
	q.push(4);
	q.push(5);
	q.push(6);
	q.push(7);
	q.push(8);
	q.push(9);
	q.push(10);
	q.push(11);
	
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());
System.out.println(q.pop());

System.out.println(q.Empty());
	
}	
	
	
	
	
	
	
	
}
