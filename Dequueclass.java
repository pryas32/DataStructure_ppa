import java.util.*;


public class Dequueclass {
    
public static void main(String args[])
{
    Deque<Integer>q=new LinkedList<>();
    q.addFirst(1);
    q.addFirst(2);
    q.addLast(23);
    q.addLast(45);

System.out.println(q.size());

System.out.println(q.getFirst());

q.remove(23);//o(index)

 Deque<Integer>q1=new  ArrayDeque<>();
 q1.addFirst(12);
q1.addLast(23);
//q1.removeFirst();

System.out.println(q1.size());

System.out.println(q1.element());

System.out.println(q1.contains(12));//here time complexity is o(n) in worst case 

}



}
