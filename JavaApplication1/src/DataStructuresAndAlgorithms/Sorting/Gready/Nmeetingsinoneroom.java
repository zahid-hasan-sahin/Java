package DataStructuresAndAlgorithms.Sorting.Gready;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Nmeetingsinoneroom {

    public static class st {

        int s, e;

    }

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.e;
            int l = ob2.e;
            return f - l;

        }

    }

    public static int maxMeetings(int start[], int end[], int n) {
        Nmeetingsinoneroom.st[] ob = new Nmeetingsinoneroom.st[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new st();
            ob[i].s = start[i];
            ob[i].e = end[i];
        }
        int c = 1;
        Arrays.sort(ob, new myCom());
        int t = ob[0].e;

        for (int i = 0; i < n; i++) {
            if (ob[i].s > t) {
                t = ob[i].e;
                ++c;
            }
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        int res = maxMeetings(a, b, n);
        System.out.println(res);
    }

}
