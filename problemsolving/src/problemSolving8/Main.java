package problemSolving8;

import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int res = Math.min(b/a, c);
        System.out.println(res);
    }
}
