class Abc<T,V>{
   T x;
   V y;
}



public class genericstest {
    public static void main(String args[])
    {
Abc<Integer,String> a=new Abc<>();
   a.x=12;
   a.y="abc";
a.y=(String)a.x;

    }





}
