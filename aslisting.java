import java.util.*;

public class aslisting {
int x;
int y;

aslisting(int x,int y)
{
    this.x=x;
    this.y=y;
}


@Override
public String toString() {
    return "(" + x + ", " + y + ")";
}

public static void main(String args[])
{
    aslisting arr[]={
        new aslisting(1, 2),
        new aslisting(2, 3),
        new aslisting(3, 4)
    };

List<aslisting>l=new ArrayList(Arrays.asList(arr));


System.out.println(Arrays.toString(arr));


}
}




//     //asList() works for both primitive type as well as for non primitive type as well
//     Integer arr[]=new Integer[]{1,2,3};


//     List<Integer>l=new ArrayList(Arrays.asList(arr));
//       System.out.println(l);  // here as we declare int type arr so it will print hashcode as java behaves differently for primitiver and non primitive type
//       //-The core reason is: Java treats primitive types and object types differently, and Arrays.asList() is designed to work with object arrays, not primitive arrays.
//        //in case of primitive type we need to travel one by one if want to kep array as of type int.

//       List<Integer>l1=new ArrayList(Arrays.asList(arr));

// System.out.println(l1);






