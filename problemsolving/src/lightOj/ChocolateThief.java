package lightOj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ChocolateThief {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            int mx = 0;
            int mn = 100000;
            String k = "";
            String b = "";
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                int d = scan.nextInt() * scan.nextInt() * scan.nextInt();
                if (d > mx) {
                    mx = d;
                    b = s;
                }
                if (d < mn) {
                    mn = d;
                    k = s;
                }
            }
            System.out.print("Case "+t+++": ");
            if(k.equals(b)){
                System.out.println("no thief");
            }else{
                System.out.println(b +" took chocolate from "+k);
            }

        }

    }
}
