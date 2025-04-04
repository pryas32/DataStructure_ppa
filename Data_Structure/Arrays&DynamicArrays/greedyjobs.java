maximum no of persons that can be assigned jobs in O(N*Log(N))

import java.io.*;
import java.util.*;

class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr1[i] = sc.nextInt();
        }

        Vector<Pair> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            v.add(new Pair(arr[i], arr1[i]));
        }

       
        Collections.sort(v, (p1, p2) -> Integer.compare(p1.second, p2.second));

        TreeMap<Integer, Integer> m = new TreeMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int start = v.get(i).first;
            int end = v.get(i).second;

           
            Map.Entry<Integer, Integer> upper = m.higherEntry(start);

            Map.Entry<Integer, Integer> previousEntry = null;
            if (upper != null) {
                previousEntry = m.lowerEntry(upper.getKey());
            } else {
                previousEntry = m.floorEntry(start);
            }

            if (previousEntry != null) {
                int key = previousEntry.getKey();
                int val = previousEntry.getValue();

                
                if (val == 1) {
                    m.remove(key);
                } else {
                    m.put(key, val - 1);
                }
            }

           
            m.put(end, m.getOrDefault(end, 0) + 1);

            if (previousEntry == null || previousEntry.getKey() < start) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
