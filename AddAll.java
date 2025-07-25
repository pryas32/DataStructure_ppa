import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AddAll {
    public static void main(String[] args) {
        // Create a mutable list of Numbers
        List<Number> l = new ArrayList<>(Arrays.asList(12, 23, 34, 45, 56));

        // Create a list of Integers
        List<Integer> l1 = Arrays.asList(12, 22);

        // Add all elements from l1 into l
        l.addAll(l1);
        System.out.println("After addAll: " + l);

        // Check if l contains all elements of l1
        System.out.println("Contains all l1? " + l.containsAll(l1));

        // Remove all elements of l1 from l
        l.removeAll(l1);
        System.out.println("After removeAll: " + l);

// Boolean collection removeif(Predicate<? super E>filter)


 l.removeIf(n -> n.intValue() % 2 == 0);

System.out.println(l);





    }
}
