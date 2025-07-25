import java.util.ArrayList;
import java.util.Arrays;

public class methodrefrences {
    public static void main(String args[])
    {

    ArrayList<Integer>a=new ArrayList<>(Arrays.asList(12,23,34,45));

    //as forEach method implement functional interface consumer so need to implement accept method here
//interface consumer<T>
// {
//     void accept(T t);
// }

    // a.forEach((t)->System.out.println(t));
//we can replace this lambda expression here with method refrence as its calling same method without doing much

a.forEach(System.out::println);


  String str[]={"abc","def","FGH"};

String str1[]={"ABC,def"};

Arrays.equals(str,str1 ,String::compareToIgnoreCase);
//or 
 Arrays.equals(str,str1,(x1,x2)->String.compareToIgnoreCase(x1,x2));
// lambda expression
//as Arrays.equals has Comparator<T>
//{
      // abstract int compare(T t1,T t2);
//}

    }
}
