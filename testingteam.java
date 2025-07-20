class Abc{
    Object  x;
    Object y;
}



// we use genercis so that we want error to be present to us at the compile time not at the runtime
//write code once and can we used many times can be used for method , data structure and for interfaces as well


public class testingteam {
    public static void main(String args[])
    {
        Abc a=new Abc();
        a.x=12;
        a.y="String";

        String str=(String)(a.x);
    }
    
}




