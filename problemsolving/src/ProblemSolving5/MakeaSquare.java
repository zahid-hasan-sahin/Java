package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MakeaSquare {

    static void combinationUtil(int arr[], int data[], int start,
            int end, int index, int r, ArrayList<Long> a) {
        if (index == r) {
            String s = "";
            for (int j = 0; j < r; j++) {
                s += data[j];
            }
            if (!s.equals("") && s.charAt(0)!='0') {
                a.add(Long.valueOf(s));
            }
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r, a);
        }
    }

    static void c(int arr[], int n, int r, ArrayList<Long> a) {

        int data[] = new int[r];

        combinationUtil(arr, data, 0, n - 1, 0, r, a);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        ArrayList<Long> a = new ArrayList<Long>();
        int k = s.length();
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < n; i++) {
            c(b, n, i, a);
        }
        a.add(Long.valueOf(s));
        Collections.sort(a, Collections.reverseOrder());

        for (int i = 0; i < a.size(); i++) {
            long p = a.get(i);
            if ((long) Math.sqrt(p) * (long) Math.sqrt(p) == p) {
                System.out.println(n - String.valueOf(p).length());
                return;
            }
        }
        System.out.println("-1");
    }
}
