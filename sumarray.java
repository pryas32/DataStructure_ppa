import java.util.List;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//avg acc to y 
class point{
    int x;
    int y;

    point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

public int getX() {
    return x;
}

public int getY() {
    return y;
}


}





public class sumarray {
    public static void main(String args[])
    {
    point p[]={new point(1, 2),new point(2, 3)};

List<Integer> l =Arrays.stream(p).collect(Collectors.toList(p.x));


    }
}
//collect
