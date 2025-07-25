
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.function.Predicate;
    import java.util.*;
    
    
    //function interface ->interfce having only one abstract method and endless no of static and default method.
    
    
    public class lambdaexpressionable {
        public static void main(String args[])
        {
        


            ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1,2,3,4));
    
    print(arr,x->x%2==0);
    
        }
    
    
    
    public static void print(List<Integer> arr, Predicate<Integer>p)
    {
            for(Integer a:arr)
            {
                if(p.test(a)==true)
                {
                    System.out.println(a);
                }
            }
    }
    
    
    
    
    }
    