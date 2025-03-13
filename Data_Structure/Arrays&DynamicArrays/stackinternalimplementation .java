

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone<T> {//stack uses arraylist for its internal implementation

    private ArrayList<Integer> s1; 
    private int size;

    Ideone() {
        s1 = new ArrayList<>();
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int top() {
        if (isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return s1.get(size - 1);
    }

    public void push(int element) {
        s1.add(element);
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Is Empty");
        } else {
           
            size--;
        }
    }

    public static void main(String args[]) {
        Ideone<Integer> s = new Ideone<>();
        s.push(12);
        s.push(11);
        System.out.println(s.size()); 
        System.out.println(s.isEmpty()); 
        System.out.println(s.top()); 
        s.pop();
        System.out.println(s.top()); 
        s.pop();
        s.pop(); 
    }
}
