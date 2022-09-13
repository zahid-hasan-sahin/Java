package problemSolving2;

import java.util.Scanner;

public class Team {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (m > (n * 2) + 2) {
            System.out.println("-1");
        } else {
            String res = "";
            while (m > 0 || n > 0) {
                if (m == n) {
                    res += "10";
                    --m;
                    --n;
                } else {
                    if (m > 1) {
                        res += "11";
                        m = m - 2;
                    }

                    if (n > 0) {
                        res += "0";
                        n--;
                    }
                    if (m == 0 && n > 0) {
                        res = "0" + res;
                        --n;
                    }
                    if (n == 0 && m > 0) {
                        res += "1";
                        --m;
                    }

                }

            }
            System.out.println(res);

        }

    }

}
