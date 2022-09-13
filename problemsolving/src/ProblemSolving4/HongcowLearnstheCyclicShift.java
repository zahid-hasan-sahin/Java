package ProblemSolving4;

import java.util.HashMap;
import java.util.Scanner;

public class HongcowLearnstheCyclicShift {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int r = 0;
        int n = s.length();
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String t = "";
            for (int j = i; j < n + i; j++) {
                t += s.charAt(j % n);
            }
           
            if (a.get(t)==null) {
                
                a.put(t, 1);
                ++r;
            }

        }
        System.out.println(r);
    }

}
