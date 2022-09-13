package lightOj;

import java.util.Scanner;

public class February29 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        scan.nextLine();
        while (q-- > 0) {
            long l = 0;
            long f = 0;
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            String a[] = s1.split(" ", -1);
            String b[] = s2.split(" ", -1);
            if (Integer.valueOf(a[2]) > Integer.valueOf(b[2])) {
                String temp[] = new String[3];
                for (int i = 0; i < 3; i++) {
                    temp[i] = a[i];
                    a[i] = b[i];
                    b[i] = temp[i];
                }

            }
            if (a[0].equals("January") || a[0].equals("February")) {
                l = Integer.valueOf(a[2]);
            } else {
                l = Integer.valueOf(a[2]) + 1;
            }
            if (b[0].equals("January") || (b[0].equals("February") && !b[1].equals("29,"))) {
                f = Integer.valueOf(b[2]) - 1;
            } else {
                f = Integer.valueOf(b[2]);
            }
            --l;
            long tem1 = l / 4 - l / 100 + l / 400;
            long tem2 = f / 4 - f / 100 + f / 400;
            
            long res = tem2-tem1;
            System.out.print("Case " + t++ + ": ");
            System.out.println(res);
        }
    }
}
