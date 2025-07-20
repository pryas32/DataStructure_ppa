public class throwsthrow {

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


public static void method() throws NullPointerException
{
    try{
        int a=12;
        int b=0;
        int c=a/b;
    }
    catch(Exception e)
    {
        throw new NullPointerException();
    }
    finally{
        System.out.println("this block runs whether exception handled or not");
    }

    System.out.println(" this run if exc3ption handled");

   
}

}


    



