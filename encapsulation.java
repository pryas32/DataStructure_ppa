public class encapsulation {
    //this is for data hiding.merans nhiding maximum amount of data and exposing only thos data members which are need by class and package
    //eg

private int marks;

public void setmarks(int x)
{
    if(x>100)
    {
        System.out.println("wrong input entered");
        return;
    }
    this.marks=x;
}


public int getMarks()
{
    return marks;
}


private void print()
{
    System.out.println(marks);
}



}
