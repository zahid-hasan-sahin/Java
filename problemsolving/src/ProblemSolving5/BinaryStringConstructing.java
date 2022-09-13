package ProblemSolving5;

import java.util.Scanner;

public class BinaryStringConstructing {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = scan.nextInt();
        int k = 0;
        String s = "";
        if (a > b) {
            s = "0";
            k = 1;
            --a;
        } else {
            s = "1";
            k = 0;
            --b;
        }
        --x;
        for (; x >= 0; x--) {
            if (k == 1) {
                --b;
            } else {
                --a;
            }
            s += k;
            k ^= 1;
        }
        int i = 0;
        while (i < s.length() && s.charAt(i) != '1') {
            ++i;
        }
        String temp = "";
        for (int j = 0; j < b; j++) {
            temp += "1";
        }
        s = s.substring(0, i) + temp + s.substring(i);

        temp = "";
        i = 0;
        while (i < s.length() && s.charAt(i) != '0') {
            ++i;
        }
        for (int j = 0; j < a; j++) {
            temp += "0";
        }
        s = s.substring(0, i) + temp + s.substring(i);
        System.out.println(s);

    }

}
