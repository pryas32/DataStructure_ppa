public class childclass extends parent{
    int y;

//inheritance means inheriting propoerties from the parent class
childclass(int x,int y)
{
    super(x);
    this.y=y;
}


public void printing ()
{
    System.out.println("child");
}

int x=1232;
public void print()
{
    System.out.println(y+" "+x);
}

}
