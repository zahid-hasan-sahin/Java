package problemSolving3.contest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class cfContest1697 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] a = new char[n + 1];
        System.out.println("? 1 1");
        a[1] = scan.next().charAt(0);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int last = 1;
        ar.add(1);
        for (int i = 2; i <= n; i++) {
            System.out.println("? 2 " + 1 + " " + i);
            int in = scan.nextInt();
            if (last != in) {
                System.out.println("? 1 " + i);
                a[i] = scan.next().charAt(0);
                ar.add(i);
            } else {
                int l = 0;
                int r = ar.size() - 1;
                int res = 0;
                System.out.println(ar);
                while (l <= r) {
                    int mid = (l + r) / 2;
                    System.out.println("? 2 " + ar.get(mid) + " " + i);
                    int x = scan.nextInt();
                    System.out.println(x + " " + (i - mid) + " " + mid);
                    if (x == (ar.size() - mid)) {
                        l = mid + 1;
                        res = mid;
                    } else {
                        r = mid - 1;
                    }
                }

                a[i] = a[ar.get(res)];
                ar.remove(res);
                ar.add(i);
            }
            System.out.println("over");
            last = in;
        }
        System.out.print("! ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
