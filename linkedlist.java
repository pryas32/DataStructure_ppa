import java.util.*;

public class linkedlist {


public static void main(String args[])
{
    //arraydeque uses circular array for its implementation hence addition here always remain o(1)
//stack using arraydeque

// ArrayDeque<Integer>arr=new ArrayDeque<>();
// arr.push(1);
// arr.push(2); // this is always o(1)
// arr.push(3);
// System.out.println(arr.peek());
// arr.pop();

// System.out.println(arr.size());

// System.out.println(arr.getFirst());


//queue->arraydeque,linkedlist and priorityqueue

Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

q.add(2);
q.add(1);
q.add(3);
System.out.println(q.peek());
System.out.println(q.poll());

q.offer(4);
System.out.print(q.size());








}




    
}
