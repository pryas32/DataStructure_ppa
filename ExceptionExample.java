// class userdefinedexception extends Exception {
//     userdefinedexception(String message){
//     super(message);
//     }
    
// }


// public class exception{
    
// public static void main(String args[])throws userdefinedexception
// {
//     try{
//     int a=Integer.parseInt(args[0]);

//     update(a);
//     }
//     catch(Exception e)
//     {
//        throw new userdefinedexception("not catch");
//     }
//     finally{
//         System.out.println(" this run");
//     }


// }

//    public static void update(int a) throws userdefinedexception
//    {
//        if(a<0)
//        {
//         throw new userdefinedexception("entered negative no ");
//        }
//    }

// }
class userdefinedexception extends Exception {
    userdefinedexception(String message) {
        super(message);
    }
}

public class ExceptionExample {

   public static void main(String[] args) throws userdefinedexception {
    try {
        int a = Integer.parseInt(args[0]);
        update(a);
    } catch (NumberFormatException e) {
        System.out.println("Invalid number format: " + e.getMessage());
    } catch (Exception e) {
        throw new userdefinedexception("this will run");
    }
}


    public static void update(int a) throws userdefinedexception {
        if (a < 0) {
            throw new userdefinedexception("Entered a negative number");
        }
    }
}
