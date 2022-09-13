package problemSolving2;

import java.util.Scanner;

public class Decoding {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String res = "";
        if (n <= 2) {
            System.out.println(s);
        } else if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    res = s.charAt(i) + res;

                } else {
                    res += s.charAt(i);
                }
            }
            System.out.println(res);

        } else {

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    res += s.charAt(i);

                } else {

                    res = s.charAt(i) + res;
                }
            }
            System.out.println(res);
        }
    }

}
