import java.util.*;

public class evennumberstream {
    
public static void main(String args[])
{
    List<Integer>l=new ArrayList<>(Arrays.asList(1, 2 ,3 ,4 ,5));


    l.stream()
    .filter(x->x%2==0)
    .forEach(System.out::println);

}


}
