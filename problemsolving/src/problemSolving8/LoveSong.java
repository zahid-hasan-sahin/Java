package problemSolving8;

import java.util.Scanner;

public class LoveSong {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        String s = scan.next();
        int[][] fre = new int[n + 1][26];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 26; j++) {
                fre[i][j] = fre[i - 1][j];
            }
            ++fre[i][s.charAt(i - 1) - 'a'];;

        }

        while (q-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            long res = 0;
            for (int i = 0; i < 26; i++) {
                res += ((fre[r][i] - fre[l - 1][i]) * ((i + 1)));

            }
            System.out.println(res);

        }

    }

}
