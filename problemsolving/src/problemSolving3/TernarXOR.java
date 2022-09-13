package problemSolving3;

import java.util.Scanner;

public class TernarXOR {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            
            int k = 0;
            StringBuffer a = new StringBuffer();
            StringBuffer b = new StringBuffer();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (k == 0) {
                        a.append("1");
                        b.append("0");
                    } else {
                        a.append("0");
                        b.append("1");
                    }
                    ++k;

                } else if (s.charAt(i) == '0') {
                    a.append( "0");
                    b.append("0");
                } else {
                    if (k == 0) {
                        a.append( "1");
                        b .append("1");
                    } else {
                        a.append( "0");
                        b.append("2");
                    }
                }

            }
            System.out.println(a);
            System.out.println(b);
        }
    }

}
