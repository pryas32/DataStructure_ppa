import java.util.ArrayList;
import java.util.Collection;


public class iterable {
    //these do have methiod called iterator and forEach for iterating over an object eg

public static void main(String args[])
{
    Collection<Integer>c=new ArrayList<>();
    c.add(12);
    c.add(23);
    c.add(34);

    System.out.println(c.size());

   System.out.println(c.contains(12));
    System.out.println(c.remove(23));


   c.forEach(System.out::println);
      

        System.out.println(c.size() );






   

}




