import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
//checked exception

import javax.management.RuntimeErrorException;

public class exceptionpart {
    

public static void main(String args[])
{

//checked exception ->at compile time handled
try{
    FileReader fr=new FileReader("C:\\Users\\LENOVO\\OneDrive\\prayas.txt");
}
catch(ArithmeticException e)
{
    System.out.println("file not found");
}
catch(FileNotFoundException e)
{
    e.printStackTrace();
}
finally{
    //this block runs whether the excpetion get handled or not.
    System.out.println("this block runs whether the excpetion get handled or not");
}

System.out.println(" this line runs if exception is handled");









}


















}
