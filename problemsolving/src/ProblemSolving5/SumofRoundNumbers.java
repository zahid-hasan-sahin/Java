package ProblemSolving5;

import java.util.ArrayList;
import java.util.Scanner;

public class SumofRoundNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') {
                    String e = "";
                    for (int j = 0; j < s.length() - i-1; j++) {
                        e += '0';
                    }
                    e = (s.charAt(i) - '0') + e;
                    int k = Integer.valueOf(e);
                    a.add(k);
                }
            }
            System.out.println(a.size());
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i)+" ");
            }
            System.out.println();

        }
    }

}
