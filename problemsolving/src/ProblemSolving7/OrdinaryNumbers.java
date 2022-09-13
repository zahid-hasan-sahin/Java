package ProblemSolving7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdinaryNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Long> ar = new ArrayList<Long>();
        for (int i = 1; i < 10; i++) {
            String s = "";
            for (int j = 0; j < 10; j++) {
                s += i;
                ar.add(Long.valueOf(s));
            }
        }
        Collections.sort(ar);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            for (int i = 0; i < ar.size(); i++) {
                if (ar.get(i) > n) {
                    System.out.println(i);
                    continue k;
                }
            }
            
        }
    }
}
