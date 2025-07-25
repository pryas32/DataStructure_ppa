// interface abc{
//     void print();
// }




// public class interfacing {

//     static void func(abc t)
//     {
//         t.print();
//     }

//     public static void main(String args[])
//     {
//             func(()->System.out.println("hello"));
//     }

    
// }
// interface abc{
//     void print(Integer p);
// }




// public class interfacing {

//     static void func(abc t,Integer x)
//     {
//         t.print(x);
//     }

//     public static void main(String args[])
//     {
//             func((p)->System.out.println("hello"),10);
//     }

    
// }


interface abc{
    void print(Integer p,Integer p1);
}




public class interfacing {

    static void func(abc t,Integer x,Integer y)//note this argument paased in func() in place of t ->(p1,p2)->System.out.println(p1+" "+p2)
    {
        t.print(x,y);
    }

    public static void main(String args[])
    {
            func((p1,p2)->System.out.println(p1+" "+p2),10,20);
    }

    
}
