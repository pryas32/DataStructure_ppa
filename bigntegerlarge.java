import java.math.BigInteger;

//BigInteger can store very large value greater than long but totally depend on memory of th computer
public class bigntegerlarge {
    
public static void main(String args[])
{

    String str="23";
BigInteger b=new BigInteger(str);

String str1="21";

BigInteger b1=new BigInteger(str1);

BigInteger c=b.add(b1);

System.out.println(c);


//big integer arithemeitic oppeations

BigInteger c1=BigInteger.valueOf(12);

BigInteger c2=BigInteger.valueOf(23);

BigInteger c3=c1.add(c2);

BigInteger c4=c1.remainder(c2);

System.out.println(c3+" "+c4);


//BigInteger to normal data type


int a1=c1.intValue();

String a2=b1.toString();
System.out.println(a1+" "+a2);

}








}
