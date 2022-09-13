package problemSolving8;

import java.util.Scanner;

public class cfContest1631 {

    static int set(int n, int k) {

        return ((1 << k) | n);
    }

    public static boolean isSet(int n,
            int k) {
        k += 1;
        if ((n & (1 << (k - 1))) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n / 2];
            int[] b = new int[n / 2];
            int p = 0;
            while (Math.pow(2, p) < n) {
                ++p;
            }
            int h = 0;
            boolean ch = true;
            for (int i = 0; i < p; i++) {

                if (isSet(k, i)) {
                    int r = n / 2;
                    if (r >= 2) {
                        int x = set(a[h], i);
                        int y = set(b[h], i);
                        a[h] = x;
                        b[h] = y;
                        ++h;
                        r -= 2;
                    }

                    for (int j = 0; j < n / 2 - 1 && r > 0; j++) {
                        if (h == j) {
                            continue;
                        }
                        int x = set(a[j], i);
                        a[j] = x;
                        --r;
                    }
                } else {
                    if(ch)
                    for (int j = 0; j < n / 2; j++) {
                        int x = set(a[j], i);
                        a[j] = x;
                    }
                }
            }
            int sum = 0;
            for (int i = 0; i < n / 2; i++) {
                sum += a[i] & b[i];
            }

            for (int i = 0; i < n / 2; i++) {
                System.out.println(a[i] + " " + b[i]);
            }
        }
    }

}
}
