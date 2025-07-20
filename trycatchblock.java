public class trycatchblock {

//using try-catch block
public static void main(String args[])
{
     try{

method();


     }
catch(Exception e )
{
    e.printStackTrace();
}
finally{
    System.out.println("this will run always");
}
System.out.println(" this will run when exception got handled");

}


public static void method()
{
    try{
        int a=12;
        int b=0;
int c=a/b;

    }
    finally{
        System.out.println("this will run whether exception handled or not");
    }

    System.out.println(" this will run when only exception got handled");
}


    
}
