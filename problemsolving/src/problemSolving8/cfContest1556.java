package problemSolving8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1556 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 1; i <= n; i += 3) {
            if (i + 2 > n) {
                break;
            }
            System.out.println("and " + i + " " + (i + 1));
            int fa = scan.nextInt();
            System.out.println("or " + i + " " + (i + 1));
            int fo = scan.nextInt();

            System.out.println("and " + (i + 1) + " " + (i + 2));
            int ma = scan.nextInt();

            System.out.println("or " + (i + 1) + " " + (i + 2));
            int mo = scan.nextInt();

            System.out.println("and " + i + " " + (i + 2));
            int la = scan.nextInt();
            System.out.println("or " + i + " " + (i + 2));
            int lo = scan.nextInt();
            int a = (fa + fo);
            int b = (ma + mo);
            int c = (la + lo);

            int x = ((a + c) - b) / 2;
            int y = (c - x);
            int z = (b - y);
            arr[i] = z;
            arr[i + 1] = y;
            arr[i - 1] = x;
        }
        int p = (n / 3) * 3;

        ++p;
        if (n % 3 >= 1) {
            System.out.println("and " + (p - 1) + " " + (p));
            int fa = scan.nextInt();
            System.out.println("or " + (p - 1) + " " + (p));
            int fo = scan.nextInt();
            int c = (fa + fo);
            arr[p - 1] = c - arr[p - 2];
            ++p;
        }

        if (n % 3 >= 2) {
            System.out.println("and " + (p - 1) + " " + (p));
            int fa = scan.nextInt();
            System.out.println("or " + (p - 1) + " " + (p));
            int fo = scan.nextInt();
            int c = (fa + fo);
            arr[p - 1] = c - arr[p - 2];
            ++p;
        }
       
        sort(arr);
        System.out.println("finish " + arr[k - 1]);

    }

    static void sort(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : a) {
            l.add(i);
        }
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }
    }
}
