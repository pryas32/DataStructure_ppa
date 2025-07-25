import java.util.*;


public class ArrayListing {
    //List Interface
    public static void main(String args[])
    {
       List<Integer>l=new ArrayList();//this create dynamic size array;
       l.add(1);
       l.add(2);
       l.add(3);
       l.set(0, 11);
      System.out.println(l.get(0));

     
         Iterator<Integer>it=l.iterator();

      while(it.hasNext())
      {
        System.out.println(it.next());
int x=it.next();
it.remove();


      }


      System.out.println(it.size());



    }












}
