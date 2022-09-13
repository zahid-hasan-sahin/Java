package lightOj;

import java.util.HashSet;
import java.util.Scanner;

public class Pinocchio {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            int in = 2;
            double c = 0;
            while (n-- > 0) {
                int s = scan.nextInt();
                if (s != in) {
                    c += Math.ceil((s - in) / 5.0);
                    
                }
                in  = s;
            }
            System.out.print("Case " + t++ + ": ");
            System.out.println((int)c);
        }
    }

}
