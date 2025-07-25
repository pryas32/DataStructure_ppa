import java.util.*;



public class ArrayLi {

public static void main(String args[])
{
    ArrayList<Integer>arr=new ArrayList<>();//1st way 
    // three ways of decalring array
    //  List<Integer>arr1=new ArrayList<>(10);//we declare intial size of array

//      arr.ensureCapacity(3);// this is how we initialze arraylist of size 23 
        
// System.out.println(arr.size());


// arr.add(0,1);
// arr.add(1,12);
// arr.set(1, 14);
// System.out.println(arr.get(0));

// System.out.println(arr.size());
// arr.clear();
// System.out.println(arr.isEmpty());


arr.add(1);
arr.add(2);
arr.add(3);
arr.add(4);
arr.add(5);




ListIterator<Integer>kas=arr.listIterator();
 while(kas.hasNext())
 {
    int x=kas.next();
    x=x*2;
    kas.set(x);
    

 }
 while(kas.hasPrevious())
 {
    System.out.println(kas.previous());
   
   
    
 }








}




    
}
