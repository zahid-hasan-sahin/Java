package problemSolving8;

import java.util.Scanner;

public class EqualizeThemAll {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] fre = new int[200010];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            ++fre[a[i]];
        }
        int mx = 0;
        int p = 0;
        for (int i = 0; i < 200010; i++) {
            if (mx < fre[i]) {
                mx = fre[i];
                p = i;
            }
        }
        int ind = 0;

        for (int i = 0; i < n; i++) {
            if (p == a[i]) {
                ind = i;
                break;
            }
        }
        mx = p;
        StringBuilder sb = new StringBuilder();
        int res = 0;
        for (int i = ind; i >= 0; i--) {
            if (a[i] == mx) {
                continue;
            }
            ++res;
            if (a[i] < mx) {
                sb.append("1 " + (i + 1) + " " + (i + 2) + "\n");
            } else {
                sb.append("2 " + (i + 1) + " " + (i + 2) + "\n");
            }
        }
        for (int i = ind; i < n; i++) {
            if (a[i] == mx) {
                continue;
            }
            ++res;
            if (a[i] < mx) {
                sb.append("1 " + (i+1) + " " + (i) + "\n");
            } else {
                sb.append("2 " + (i+1) + " " + (i) + "\n");
            }
        }
        System.out.println(res);
        System.out.println(sb);
    }

}
