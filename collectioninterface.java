import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import java.lang.Integer;
public class collectioninterface {

    public static void main(String args[]) {
        Collection<Integer> c = new ArrayList<>();
        c.add(12);
        c.add(23);
        c.add(34);
        c.add(45);

        Object[] array = c.toArray();  // FIXED LINE

       for(Object e: array)
       {
        System.out.println(e);
       }




      // if we want to chnage object to Integer that will give  me error 
         // Integer [] arr=array;XX

           Integer [] arr= c.toArray(new Integer[0]);// here we are assigning data type of array that is first element



           
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        Iterator<Integer> it = c.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
