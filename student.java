import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class student  {
 public static void main(String args[])
 {
    //comparator

String[] s={"def","abc","aeb","null"};



Arrays.sort(s,Comparator.nullsFirst(Comparator.reverseOrder()));

for(String s1:s)
System.out.print(s1);





 }   






}