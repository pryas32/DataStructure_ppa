import java.util.*;

public class sorting {
   
     int x;
     int y;

     sorting(int x, int y) {
         this.x = x;
         this.y = y;
     }

   @Override
    public boolean equals(Object p)
    {
        if(this==p)
        return true;

      if(!(p instanceof sorting))
       return false;

sorting o=(sorting)p;
return o.x==x && o.y==y;

    }

    

    // // Required for binarySearch to work: must define compareTo
    

    public static void main(String args[]) {
     List<sorting>s=new ArrayList<>();
     s.add(new sorting(1, 2));
     s.add(new sorting(2, 3));
     s.add(new sorting(3, 4));
     s.add(new sorting(1, 2));

    sorting s1=new sorting(1, 2);

      System.out.println(Collections.frequency(s,s1));
    }
}
