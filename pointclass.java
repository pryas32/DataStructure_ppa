import java.util.Arrays;

class point{
    int x;
    int y;


point(int x,int y)
{
    this.x=x;
    this.y=y;
}


}

//interfae Comparator<T>
//{
    //  int compare(T a ,T b);
//}



public class pointclass {
   public static void main(String args[])
   {
     point p[]={ new point(12,23),
    new point(23,34),
    new point(33,44)
};
  
Arrays.sort(p,(p1,p2)->(p1.x-p2.x));

for(point e:p)
{
System.out.println(e.x+" "+e.y);
}


}




}




