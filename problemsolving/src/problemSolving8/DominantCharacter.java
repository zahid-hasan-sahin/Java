package problemSolving8;

import java.util.Scanner;

public class DominantCharacter {

    static boolean isPos(char[] arr, int n, int k) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] == 'a') {
                ++a;
            } else if (arr[i] == 'b') {
                ++b;
            } else {
                ++c;
            }
        }
        if (a > b && a > c) {
            return true;
        }

        for (int i = k; i < n; i++) {

            if (arr[i - k] == 'a') {
                --a;
            } else if (arr[i - k] == 'b') {
                --b;
            } else {
                --c;
            }
            if (arr[i] == 'a') {
                ++a;
            } else if (arr[i] == 'b') {
                ++b;
            } else {
                ++c;
            }
            if (a > b && a > c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            char[] a = scan.next().toCharArray();
            for (int i = 2; i <= Math.min(n, 10); i++) {
                if (isPos(a, n, i)) {
                    System.out.println(i);
                    continue k;
                }
            }
            System.out.println("-1");
        }
    }
}
