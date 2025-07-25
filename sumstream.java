import java.util.*;
import java.util.stream.Stream;

public class sumstream {
 
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3,4};

    //    int summation=Arrays.stream(arr).sum();
   
    //    System.out.println(summation);


//Arrays.stream()->in case of non primitive return null as optional class if we use max(),min(),avg();

//for primitive type it uses optional class of primitive int like getasInt(), etc 


               int maxii=Arrays.stream(arr)
               .max()
               .getAsInt();
             System.out.println(maxii);

//finding avg of an array

//          List<Integer>l=new ArrayList<>(Arrays.asList(1,2,3,4));

//     double d=l.stream().mapToInt(Integer :: intValue)  // as non priitve stream doesnt has avg function hence firstly map to primitive type through maptoInt(INteger :: intValue ) then find avg.
//     .average()
//     .getAsDouble();
// System.out.println(d);


//print first n natural no with given digit d

    Stream.iterate(1, x->x+1)//stream of infinte no
    .filter(x->x.toString().contains("5"))// filter the stream to string having 5 as digit 
    .limit(10)// the function will run until it doesnt count totol 10 numbers.
    .forEach(System.out::println);



    }










}
