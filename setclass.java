import java.util.*;

public class setclass{

public static void main(String args[])
{
    
     List<Integer>arr1=new ArrayList<>(Arrays.asList(1,2,0,3,1));


Set<Integer> s2 = new TreeSet<>(arr1);//it uss red black tree self balancing binary search tree it implement comparator methoid fof sorting for unknown sorting you need to write your own comparator function.


for(Integer i:s2)
{
   System.out.println(i);
}

Set<Integer>s3=new LinkedHashSet<>(arr1);

// this we use when we need order of insertion although it also contains same function as that arrayList ,Set but it maiintains order of insertion.

System.out.println("_________________________________________________________");


for(Integer i:s3)
{
    System.out.println(i);
}

   




//traversal through set interface

for(Integer i:s2)//traversal through set 
{
    System.out.println(i);
}
//also we can travel through st using iterator.










}













}