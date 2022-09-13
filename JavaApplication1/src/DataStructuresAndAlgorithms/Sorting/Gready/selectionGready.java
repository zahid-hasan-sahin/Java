package DataStructuresAndAlgorithms.Sorting.Gready;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class selectionGready {

    public static class st {

        int f, l;

        public void set(int i, int j) {
            int f = i;
            int l = j;
        }
    }

    public static class mycom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.l;
            int l = ob2.l;
            return f > l ? 1 : -11;

        }

    }

    public static void main(String args[]) {
        selectionGready o = new selectionGready();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        selectionGready.st[] ob = new selectionGready.st[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new st();
            ob[i].f = scan.nextInt();
            ob[i].l = scan.nextInt();
        }
    //    Arrays.sort(ob, o.new mycom());
        int j = ob[0].l;
        System.out.println(ob[0].f + " " + ob[0].l);
        for (int i = 1; i < n; i++) {
            if (j <= ob[i].f) {
                System.out.println(ob[i].f + " " + ob[i].l);
                j = ob[i].l;
            }
        }

    }

}
