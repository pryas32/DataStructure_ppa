public class lambdaexpression {
   
   here argument inherit the data type from the functonal interface defined

    public static void main(String args[])
    {
       
        for this type we have below lambda expression
    
        interface abc<T>{
       abstract void print();
    }

       
        //no argument
        ()->System.out.println("hello");

        //one argument

      interface abc<T>{
       abstract void print(T p);
    }


        (p)->System.out.println(p);
   
       //two argument


  interface abc<T>{
       abstract void print(T p1,T p2);
    }


       (p1,p2)->System.out.println(p1,p2);
   
   
   
    }



















}
