import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class iteratoring {
//for each loop
public static void main(String args[])
{
List<Integer>l=new ArrayList<>(Arrays.asList(12,234,345,2));
for(Integer i : l)
{
    System.out.println(i);
}

System.out.println("hello world");

l.forEach(x->System.out.println(x));




}



    
}
