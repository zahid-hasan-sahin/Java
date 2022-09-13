package lab6_2;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A {
    
    public static void main(String args[]) {
        try {
            File file = new File("C:\\Users\\zahid\\Desktop\\New folder\\task3_input.txt");
            Scanner sc = new Scanner(file);
            
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            String in = sc.next();
            Arrays.sort(a);
            PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return b - a;
                }
            });
            int curr = 0;
            int jack = 0;
            int jill = 0;
            ArrayList<Integer> res = new ArrayList<Integer>();
            for (int i = 0; i < in.length(); i++) {
                if (in.charAt(i) == 'J') {
                    q.add(a[curr]);
                    res.add(a[curr]);
                    jack = jack + a[curr];
                    ++curr;
                } else {
                    int c = q.peek();
                    q.poll();
                    res.add(c);
                    jill = jill + c;
                    
                }
            }
            
            FileWriter wr = new FileWriter("C:\\Users\\zahid\\Desktop\\New folder\\task3_output.txt");
            for (int i = 0; i < res.size(); i++) {
                wr.write(res.get(i)+"");
            }
            wr.write("\r\n");
            wr.write("Jack will work for " + jack + " hours\r\n");
            wr.write("Jill will work for " + jill + " hours\r\n");
            wr.close();
        } catch (Exception e) {
            
        }
    }
}
