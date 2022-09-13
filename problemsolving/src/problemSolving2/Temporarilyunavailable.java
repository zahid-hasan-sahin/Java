package problemSolving2;

import java.util.Scanner;

public class Temporarilyunavailable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int r = scan.nextInt();
            if (a < b) {
                int fres = Math.min((c + r) - a, (c - r) - a) > 0 ? Math.min((c + r) - a, (c - r)-a) : 0;
                int lres = Math.min(b-(c + r) , b-(c - r)) > 0 ? Math.min(b-(c + r), b-(c - r)) : 0;
                
                System.out.println(fres+" "+lres);

            }else{
                System.out.println(".......");
            }

        }

    }
}
