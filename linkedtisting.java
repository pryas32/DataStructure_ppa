import java.util.*;

public class linkedtisting {
    public static void main(String args[]){

        List<Integer>l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);// this is where linkedlist has o(1) where as arraylist has o(n) for remove function is also o(1) whereeas in arraylist its o(n)

        System.out.println(l.size());

        System.out.println(l.contains(3));//o(n) in wordt case 
        
       l.clear();






    }
}
