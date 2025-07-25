import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;



class MyPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer x) {
        return x % 2 == 0;
    }
}






public class lambdaexperssion {
    public static void main(String args[])
    {
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1,2,3,4));

print(arr,new MyPredicate());

    }



public static void print(List<Integer> arr, Predicate<Integer>p)
{
        for(Integer a:arr)
        {
            if(p.test(a)==true)
            {
                System.out.println(a);
            }
        }
}




}
