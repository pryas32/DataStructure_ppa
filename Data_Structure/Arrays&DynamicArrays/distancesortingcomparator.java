//sorting point acc to distance from the origin using comparator


import java.util.*;

class Point {  //sorting using comparator consisering value first if values are same then using index .
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyCmp implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
     return  ((p1.x*p1.x+p1.y*p1.y)-(p2.x*p2.x+p2.y*p2.y));
      
    }
}

 class GFG {
    public static void main(String args[]) {
        List<Point> l = new ArrayList<>();
        l.add(new Point(1, 0));
        l.add(new Point(2, 1));
        l.add(new Point(4, 2));
        l.add(new Point(3, 3));

        Collections.sort(l, new MyCmp());

        for (Point p : l) {
            System.out.println(p.x + " " + p.y);
        }
    }
}


