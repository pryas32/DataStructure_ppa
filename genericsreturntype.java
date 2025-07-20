public class genericsreturntype {
    

public static void main(String args[])
{
    Integer arr[]={1,2,3};

    int a=2;
     System.out.println(method(arr,a));
}


public static <T,V> int method(T arr[],V e )
{   int res=0;
    for(T e1: arr)
    {
       if(e1.equals(e))
       {
       res++;
       }
    }

return res;

}


}
