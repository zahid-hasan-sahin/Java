package ProblemSolving5;

import java.util.HashSet;
import java.util.Scanner;

public class InnaandAlarmClock {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<Integer> a = new HashSet<Integer>();
        HashSet<Integer> b = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
            b.add(scan.nextInt());
        }
        System.out.println(Math.min(a.size(), b.size()));
    }

}
