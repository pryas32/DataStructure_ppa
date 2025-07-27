import java.util.Arrays;

public class equalsoperation {
int x;
int y;

equalsoperation(int x,int y){
    this.x=x;
    this.y=y;
}


@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    equalsoperation other = (equalsoperation) obj;
    return this.x == other.x && this.y == other.y;
}





public static void main(String args[])
{

equalsoperation c[]={
    new equalsoperation(1, 2),
    new equalsoperation(2, 3),
    new equalsoperation(3, 4)
};

equalsoperation c1[]={
     new equalsoperation(1, 2),
    new equalsoperation(2, 3),
    new equalsoperation(3, 4)
};

System.out.println(Arrays.equals(c, c1));




//   Integer arr[]=new Integer[]{1,2,3,4};

//   Integer arr1[]=new Integer[]{1,2,3,4};


//   System.out.println(Arrays.equals(arr,arr1));






}




    
}
