package ProblemSolving5;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class SocialNetwork {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Deque<Integer> d = new LinkedList<Integer>();
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (d.size() < k) {
                if (h.get(in) == null || h.get(in) == 0) {
                    d.addFirst(in);
                    h.put(in, 1);
                }

            } else {
                if (h.get(in) == null || h.get(in) == 0) {
                    h.put(d.removeLast(),0);
                    h.put(in,1);
                    d.addFirst(in);
                }
            }
            

        }
       
        System.out.println(d.size());
        for (int e : d) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
