package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class Towers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] len = new int[n];
        for (int i = 0; i < n; i++) {
            len[i] = scan.nextInt();
        }
        Arrays.sort(len);
        int tl = len[0];
        int mh = 1;
        int th = 1;
        int res = 1;
        int temp = 1;
        for (int i = 1; i < n; i++) {
            if (tl == len[i]) {
                mh++;
                tl = tl + len[i];
                if (temp > tl) {
                    res = temp;
                } else {
                    res = mh;
                }
                temp = 1;
            } else {
                th++;
                tl = len[i];
                ++temp;
                mh = 1;
            }
        }
        System.out.println(res + " " + th);

    }
}
