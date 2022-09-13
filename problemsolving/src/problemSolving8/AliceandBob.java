package problemSolving8;

import java.util.Scanner;

public class AliceandBob {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
    
        int n = scan.nextInt();
        int mx = 0;
        int g = 0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            mx = Math.max(mx, in);
            g = gcd(in, g);
        }
      
        int t = (mx/g) - n;
        if (t % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
