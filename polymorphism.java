public class polymorphism {
   // poly means many morphism means forms

    //method overloading
    //here automatic type conversion happen
//eg

void print(long x)
{
    System.out.println("long");
}

void print(float f)
{
    System.out.println("floating number");
}

public static void main(String args[])
{
    polymorphism p=new polymorphism();
    p.print(12);
}



}









