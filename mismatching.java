import java.util.Arrays;

public class mismatching {

public static void main(String args[])
{
     int arr[]=new int[]{1,2,3};

     int[] arr1=new int[]{1,2,3};
     
     int x=Arrays.mismatch(args, args);
System.out.println(x);


String str[]={"abc","bcd","ef"};

String str1[]={"abc","bcd","def"};

int x1=Arrays.mismatch(str, str1,String::compareToIgnoreCase);

System.out.println(x1);





}




    
}
