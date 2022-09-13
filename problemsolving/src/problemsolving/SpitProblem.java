package problemsolving;

import java.util.Scanner;

public class SpitProblem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
            d[i] = scan.nextInt();
        }
        boolean res = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i] + d[i] == x[j] && x[j] + d[j] == x[i]) {
                    res = true;
                    break;
                }
            }

        }
        if (res) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
