//sorting acc to freq and then value then index.

class Point {  //sorting using comparator consisering value first if values are same then using index .
    int value,freq,index;

    Point(int x, int y,int z) {
        this.value = x;
        this.freq = y;
         this.index=z;
    	
    }
}

class MyCmp implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
     if(p1.freq!=p2.freq)
     {
     	return p1.freq-p2.freq;
     }
      else if(p1.value!=p2.value){
     	return p1.value-p2.value;
     }
     else {
     	return p1.index-p2.index;
     }
 
      
    }
}

public class GFG {
    public static void main(String args[]) {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	int n=sc.nextInt();
    	
    	int arr[]=new int[n];
    	
    	for(int i=0;i<=n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	
    	
    	
    	int freq[]=new int[100];
    	
    	Arrays.fill(freq,0);
    	
    	for(int i=0;i<n;i++)
    	{
    		freq[arr[i]]++;
    	}
    	
    	List<Point>l=new ArrayList<>();
       
       for(int i=0;i<n;i++)
       {
       	Point p1=new Point(arr[i],freq[arr[i]],i);
       	
       	l.add(p1);
       }
       
       

        Collections.sort(l, new MyCmp());

        for (Point p : l) {
            System.out.println(p.value );
        }
    }
}

now its fine the code is ok
