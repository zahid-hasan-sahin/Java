package problemSolving8;

import java.util.Scanner;

public class LostNumbers {

    static void p(int[] a, int l, int r, int[] res) {
        if (l == a.length) {
            if (a[0] * a[1] == res[0] && a[1] * a[2] == res[1] && a[3] * a[4] == res[2] && a[4] * a[5] == res[3]) {
                 System.out.print("! ");
                for (int i = 0; i < 6; i++) {
                   
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
        for (int i = l; i < r; i++) {
            int t = a[l];
            a[l] = a[i];
            a[i] = t;
            p(a, l + 1, r, res);
            t = a[l];
            a[l] = a[i];
            a[i] = t;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] a = {4, 8, 15, 16, 23, 42};
        int[] res = new int[4];
        System.out.println("? 1 2");
        res[0] = scan.nextInt();
        System.out.println("? 2 3");
        res[1] = scan.nextInt();
        System.out.println("? 4 5");
        res[2] = scan.nextInt();
        System.out.println("? 5 6");
        res[3] = scan.nextInt();
        p(a, 0, 6, res);
    }

}
