package problemSolving6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NewClass5 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("? 1");
        int a = scan.nextInt();
        System.out.println("? " + n);
        int b = scan.nextInt();
        int l = 1;
        int r = n;
        if (n == 1) {
            System.out.println("! 1");
            return;
        }
        int[] arr = new int[n + 10];
        arr[0] = 1000000000;
        arr[n + 1] = 1000000000;
        System.out.println("? " + (n - 1));
        arr[n - 1] = scan.nextInt();
        System.out.println("? " + (2));
        arr[2] = scan.nextInt();
        arr[1] = a;
        arr[n] = b;
        if (arr[1] < arr[2]) {
            System.out.println("! " + 1);
            return;
        }
        if (arr[n - 1] > arr[n]) {
            System.out.println("! " + (n));
            return;
        }
        while (l < r) {
            int mid = (r + l) / 2;
            System.out.println("? " + mid);
            int k = scan.nextInt();
            arr[mid] = k;

            if (mid + 1 <= n) {
                System.out.println("? " + (mid + 1));
                arr[mid + 1] = scan.nextInt();
            }

            if (mid - 1 >= 1) {
                System.out.println("? " + (mid - 1));
                arr[mid - 1] = scan.nextInt();
            }
            if (arr[mid - 1] > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;

            }
        }

        System.out.println("? " + l);
        arr[l] = scan.nextInt();
        if (l + 1 <= n) {
            System.out.println("? " + (l + 1));
            arr[l + 1] = scan.nextInt();
        }
        if (l - 1 >= 1) {
            System.out.println("? " + (l - 1));
            arr[l - 1] = scan.nextInt();
        }
        System.out.println("? " + r);
        arr[r] = scan.nextInt();
        if (r + 1 <= n) {
            System.out.println("? " + (r + 1));
            arr[r + 1] = scan.nextInt();
        }
        if (r - 1 >= 1) {
            System.out.println("? " + (r - 1));
            arr[r - 1] = scan.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            if (arr[i] != 0 && arr[i - 1] != 0 && arr[i + 1] != 0) {
                if (arr[i] < arr[i + 1] && arr[i] < arr[i - 1]) {
                    System.out.println("! " + i);
                    return;
                }
            }
        }

    }

}
