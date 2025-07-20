public class multitesting {

public static void main(String args[])
{
    multithreaading t=new multithreaading();
    t.start();
   for(int i=0;i<4;i++)
   {
    System.out.print(i);
   }

}

    
}
