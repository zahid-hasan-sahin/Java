package problemSolving8;

import java.util.Scanner;

public class Journey {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            char[] a = scan.next().toCharArray();
            int[] res = new int[n + 1];
            int c = 0;
            int c2 = 0;
            char curr = 'L';
            char curr2 = 'R';
            for (int i = 1; i <= n; i++) {
                if (a[i - 1] == curr) {
                    ++c;
                    if (curr == 'L') {
                        curr = 'R';
                    } else {
                        curr = 'L';
                    }
                } else {
                    if (a[i - 1] == 'L') {
                        c = 1;
                        curr = 'R';
                    } else {
                        c = 0;
                        curr = 'L';
                    }
                }

                if (a[i - 1] == curr2) {
                    ++c2;
                    if (curr2 == 'L') {
                        curr2 = 'R';
                    } else {
                        curr2 = 'L';
                    }
                } else {
                    if (a[i - 1] == 'R') {
                        c2 = 1;
                        curr = 'L';
                    } else {
                        c2 = 0;
                        curr = 'R';
                    }
                }

                if (a[i - 1] == 'L') {
                    res[i] = Math.max(c, c2);
                }
            }
            curr = 'R';
            curr2 = 'L';
            c = 0;
            c2 = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == curr) {
                    ++c;
                    if (curr == 'L') {
                        curr = 'R';
                    } else {
                        curr = 'L';
                    }
                } else {
                    if (a[i] == 'R') {
                        c = 1;
                        curr = 'L';
                    } else {
                        c = 0;
                        curr = 'R';
                    }
                }

                if (a[i] == curr2) {
                    ++c2;
                    if (curr2 == 'L') {
                        curr2 = 'R';
                    } else {
                        curr2 = 'L';
                    }
                } else {
                    if (a[i] == 'L') {
                        c2 = 1;
                        curr = 'R';
                    } else {
                        c2 = 0;
                        curr2 = 'L';
                    }
                }

                if (a[i] == 'R') {
                    res[i] += Math.max(c, c2);
                }
            }
            for (int i = 0; i <= n; i++) {
                System.out.print(res[i] + 1 + " ");
            }
            System.out.println();

        }

    }

}
