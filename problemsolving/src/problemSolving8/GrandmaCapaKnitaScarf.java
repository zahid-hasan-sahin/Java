package problemSolving8;

import java.util.Scanner;

public class GrandmaCapaKnitaScarf {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            char[] a = scan.next().toCharArray();
            int l = 0;
            int r = n - 1;
            while (l <= r) {
                if (a[l] != a[r]) {
                    int left = 0;
                    int right = n - 1;
                    int res1 = 0;

                    while (left <= right) {
                        if (a[left] != a[right]) {
                            ++res1;
                            if (a[left] == a[l]) {
                                ++left;
                            } else if (a[right] == a[l]) {
                                --right;
                            } else {
                                res1 = 1000000000;
                                break;
                            }
                        } else {
                            ++left;
                            --right;
                        }
                    }
                    int res2 = 0;
                    left = 0;
                    right = n - 1;

                    while (left <= right) {
                        if (a[left] != a[right]) {
                            ++res2;
                            if (a[left] == a[r]) {
                                ++left;
                            } else if (a[right] == a[r]) {
                                --right;
                            } else {
                                res2 = 1000000000;
                                break;
                            }
                        } else {
                            ++left;
                            --right;
                        }
                    }

                    if (Math.min(res1, res2) == 1000000000) {
                        System.out.println(-1);
                    } else {
                        if (res1 == 1000000000) {
                            System.out.println(res2);
                        } else if (res2 == 1000000000) {
                            System.out.println(res1);
                        } else {
                            System.out.println(Math.min(res1, res2));
                        }
                    }
                    continue k;
                }
                ++l;
                --r;
            }
            System.out.println("0");
        }
    }

}
