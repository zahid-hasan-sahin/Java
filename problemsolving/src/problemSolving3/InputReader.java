package problemSolving3;

import java.util.Scanner;

class InputReader {

    static int countOdd(int L, int R) {
        int N = 0;
        if (R > L) {
            N = (R - L) / 2;
        } else {
            N = (L - R) / 2;
        }
        if (R % 2 != 0 || L % 2 != 0) {
            N++;
        }
        return N;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int odds = countOdd(n, m);
        System.out.println(odds);
    }
}
