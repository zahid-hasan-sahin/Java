package problemSolving3;

import java.util.Scanner;

public class ArpashardexamandMehrdadsnaivecheat {

    public static void ex(int a, int n) {
        int res = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                res = ((res % 10) * (a % 10)) % 10;
                --n;
            }
            a = ((a % 10) * (a % 10)) % 10;
            n = n / 2;
        }
        System.out.println(res);

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ex(1378, n);
    }

}
