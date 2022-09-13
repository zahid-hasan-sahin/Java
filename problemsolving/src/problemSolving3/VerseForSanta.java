package problemSolving3;

import java.util.Scanner;

public class VerseForSanta {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int s = scan.nextInt();
            int[] needTime = new int[n];
            for (int i = 0; i < n; i++) {
                needTime[i] = scan.nextInt();
            }
            int i = 0;
            int spendTime = 0;
            int mx = 0;
            int mxIndex = 0;
            while (spendTime + needTime[i] <= s) {
                if (i == n) {
                    break;
                }
                spendTime += needTime[i];
                System.out.println(spendTime + " " + i);
                if (spendTime >= s) {
                    break;
                }
                if (needTime[i] > mx) {
                    mx = needTime[i];
                    mxIndex = i;
                }
                ++i;
            }
            System.out.println(i);
            if (i >= n - 1) {
                System.out.println(0);
            } else if (needTime[i + 1] + needTime[i + 2] <= mx) {
                System.out.println(mxIndex + 1);
            } else {
                System.out.println(0);
            }
        }

    }

}
