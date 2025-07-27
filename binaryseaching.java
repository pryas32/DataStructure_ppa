import java.util.Arrays;

public class binaryseaching {

int x;
int y;


binaryseaching(int x,int y)
{
    this.x=x;
    this.y=y;
}

public String toString()
{
    return x +" "+ y;
}


public static void main(String args[])
{
//    int arr[]=new int[]{2,3,4,5};

//    int a=Arrays.binarySearch(arr, 1);

// System.out.println(a);


//  Integer arr1[]=new Integer[]{2,3,4,5};

//    int a1=Arrays.binarySearch(arr1, 1);

// System.out.println(a1);

binaryseaching b[]={new binaryseaching(1, 2),
    new binaryseaching(2, 3)};

binaryseaching b11=new binaryseaching(3, 1);


   int x1=Arrays.binarySearch(b,b11,(b1,b2)->(b1.x-b2.x));

System.out.println(x1);

}

}

