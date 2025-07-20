public class threadingtesting {

    public static void main(String args[])
    {
        Thread t=new Thread(new threading());
        t.start();
    for(int i=0;i<5;i++)
    {
        System.out.println("t start");
        try{
        Thread.sleep(1);
    }catch(Exception e)
    {
        System.out.println("hello world");
    }


    }






    }
}
