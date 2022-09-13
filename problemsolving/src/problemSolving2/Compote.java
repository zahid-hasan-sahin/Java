package problemSolving2;

import java.util.Scanner;

public class Compote {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int a = scan.nextInt();
        int p = scan.nextInt();
        int res = 0;
        while (true) {
            if (l >= 1 && a >= 2 && p >= 4) {
                res += 7;
                --l;
                a -= 2;
                p -= 4;
            } else {
                break;
            }
        }
        System.out.println(res);

    }

}
