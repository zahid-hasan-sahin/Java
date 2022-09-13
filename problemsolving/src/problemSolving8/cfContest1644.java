package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1644 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                a[i] += x;
            }
            ArrayList<Long> ar = new ArrayList<Long>();
            int l = 0;
            int r = 0;
            long max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
            for (int i = 0; i < n; i++) {
                max_ending_here = max_ending_here + a[i];
                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                    r = i;
                }
                if (max_ending_here < 0) {
                    l = i + 1;
                    max_ending_here = 0;
                }
            }

            long max = max_so_far;
            if (max_so_far <= 0) {
                for (int i = 0; i < n; i++) {
                    ar.add((long) 0);
                }

            } else {
                for (int i = 0; i <= n - (r - l + 1); i++) {
                    ar.add(max);
                }
                int p = r - l + 1;
                for (int i = 0; i < p; i++) {
                    max_so_far = Integer.MIN_VALUE;
                    max_ending_here = 0;
                    a[l] -= x;
                    for (int j = l; j <= r; j++) {
                        max_ending_here = max_ending_here + a[j];
                        if (max_so_far < max_ending_here) {
                            max_so_far = max_ending_here;
                        }
                        if (max_ending_here < 0) {
                            max_ending_here = 0;
                        }
                    }

                    long m1 = max_so_far;
                    a[l] += x;

                    max_so_far = Integer.MIN_VALUE;
                    max_ending_here = 0;
                    a[r] -= x;
                    for (int j = l; j <= r; j++) {
                        max_ending_here = max_ending_here + a[j];
                        if (max_so_far < max_ending_here) {
                            max_so_far = max_ending_here;
                        }
                        if (max_ending_here < 0) {
                            max_ending_here = 0;
                        }
                    }

                    long m2 = max_so_far;
                    a[r] += x;

                    if (m1 > m2) {

                        ++l;
                        ar.add(m1);
                    } else {

                        --r;
                        ar.add(m2);
                    }
                }

            }
            for (int i = ar.size() - 1; i >= 0; i--) {
                System.out.print(Math.max(0, ar.get(i)) + " ");
            }
            System.out.println();
        }

    }
}
