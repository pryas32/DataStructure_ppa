import java.util.ArrayList;
import java.util.Arrays;

public class gfg {

public static void main(String args[])
{
    ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(12,23,34));

arr.forEach(gfg::printsquare);

}

public static void printsquare(Integer x)
{
   System.out.println(x*x);
}

}