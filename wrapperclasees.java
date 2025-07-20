import java.util.ArrayList;

class student{
    void print()
    {
        System.out.println("student");
    }
}

class employee extends student{
    void print()
    {
        System.out.println("employee");
    }
}







public class wrapperclasees {
    
public static void main(String args[])
{
    //ArrayList<student>s=new ArrayList<>();

  //  ArrayList<employee>e=new ArrayList<>();

   // s=e;//giev error  this is where generics fails they were used to have code once and can be used multiple places
   
//    ArrayList<?>s=new ArrayList<>();// means all classes can be assigned to s;
//    s=e;

//ArrayList<? extends student>s=new ArrayList<>(); //student and its descendant can be only assigned
//s=e;


ArrayList<?  super student>s=new ArrayList<>();//stuident and its ancestor can be added only
ArrayList<Object> e=new ArrayList<>();

s=e;


}

}
