import java.util.Arrays;
import java.util.Comparator;

public class thencomparing {
int x;
int y;

thencomparing(int x,int y)
{
    this.x=x;
    this.y=y;
}


public String toString()
{
   return x+" "+y;
}


public int getX()
{
    return x;
}


public int getY()
{
    return y;
}





public static void main(String args[])
{
    thencomparing p[]={
        new thencomparing(3, 5),
        new thencomparing(1, 2),
        new thencomparing(3, 4)
    };


    Arrays.sort(p, Comparator.comparing(thencomparing::getX).thenComparing(thencomparing::getY));

    System.out.println(Arrays.toString(p));

}











    
}
