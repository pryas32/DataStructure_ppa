import java.util.Arrays;
import java.util.*;

public class Arrayscollection {
int x;
int y;
Arrayscollection(int x,int y)
{
    this.x=x;
    this.y=y;
}

public String toString()
{
   return x+" "+y;

}

public static void main(String args[])
    {
    Arrayscollection arr[]=new Arrayscollection[3];

Arrayscollection a=new Arrayscollection(4, 5);

      Arrays.fill(arr,a);

System.out.println(Arrays.toString(arr));



//         Integer arr[]=new Integer[]{1,2,3,4};
//         Integer arr2[]=new Integer[5];

//      Arrays.fill(arr2,2,4,2);

// System.out.println(Arrays.toString(arr2));

    }
}
