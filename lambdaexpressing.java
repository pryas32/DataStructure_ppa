import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class lambdaexpressing {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12, 23, 11, 10));
       
    
       
       
        method(arr,t->t%2==0);
    }

    public static void method(List<Integer> ar, Predicate<Integer> p) {
        for (Integer i : ar) {
            if (p.test(i)) {
                System.out.println(i);
            }
        }
    }
}
