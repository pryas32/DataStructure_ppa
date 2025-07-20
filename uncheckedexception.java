public class uncheckedexception {

public static void main(String args[])
{
   try{
       int arr[]=new int[2];
       int sum=arr[0]+arr[1]+arr[2];
   }
catch(ArrayIndexOutOfBoundsException e)
{
    e.printStackTrace();
}
finally{
    System.out.println("this block runs whether exception get handled or not");
}
System.out.println("sum not found");






}



    
}
