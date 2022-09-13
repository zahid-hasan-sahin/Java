package problemsolving;

import java.util.Scanner;

public class NewYearTransportation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int[] pos = new int[n];
        pos[0] = 1;
        for (int i = 1; i < n; i++) {
            pos[i] = scan.nextInt();
        }

        int i = 0;
        int res = 0;
        while (i <= t) {
            int temp = pos[i];
            i = temp + i;
            if (i == t) {
                ++res;
                break;
            }
        }
        if (res > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
