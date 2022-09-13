package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class InfinityGauntlet {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = {"Power", "Time", "Space", "Soul", "Reality", "Mind"};
        int[] a = new int[7];
        for (int i = 0; i < n; i++) {
            String in = scan.next();

            if (in.equals("purple")) {
                ++a[1];
            }
            if (in.equals("green")) {
                ++a[2];
            }
            if (in.equals("blue")) {
                ++a[3];
            }
            if (in.equals("orange")) {
                ++a[4];
            }
            if (in.equals("red")) {
                ++a[5];
            }
            if (in.equals("yellow")) {
                ++a[6];

            }
        }

        ArrayList<String> res = new ArrayList<String>();
        for (int j = 1; j < 7; j++) {

            if (a[j] == 0) {
                res.add(s[j - 1]);
            }
        }
        System.out.println(res.size());
        for (int j = 0; j < res.size(); j++) {
            System.out.println(res.get(j));

        }
    }
}
