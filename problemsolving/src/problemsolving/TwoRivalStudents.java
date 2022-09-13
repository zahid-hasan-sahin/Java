package problemsolving;

import java.util.Scanner;

public class TwoRivalStudents {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int temp = 0;
            if (a > b) {
                while (true) {
                    while (a < n && x != 0) {
                        ++a;
                        --x;
                    }
                    while (b >= 2 && x != 0) {
                        --b;
                        --x;
                    }
                    break;
                }
            } else {
                while (true) {
                    while (b < n && x != 0) {
                        ++b;
                        --x;
                    }
                    while (a >= 2 && x != 0) {
                        --a;
                        --x;
                    }
                    break;
                }
            }
            System.out.println(a - b > 0 ? a - b : b - a);

        }
    }
}
