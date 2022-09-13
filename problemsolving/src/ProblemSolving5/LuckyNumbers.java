package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuckyNumbers {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<Long> b = new ArrayList<Long>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += "47";

            permute(s, 0, s.length() - 1, a);
        }
        for (int i = 0; i < a.size(); i++) {
            b.add(Long.valueOf(a.get(i)));
        }
        Collections.sort(b);
        int k = 0;
        while (b.get(k) < n) {
            ++k;
        }
        System.out.println(b.get(k));
    }

    static void permute(String str, int l, int r, ArrayList<String> a) {
        if (a.contains(str)) {
            return;
        }
        if (l == r) {
            a.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, a);
                str = swap(str, l, i);
            }
        }
    }

    static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);

    }

}
