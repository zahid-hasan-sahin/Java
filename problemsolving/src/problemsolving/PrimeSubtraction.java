package problemsolving;

import java.util.Scanner;

public class PrimeSubtraction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while(total>0){
            long f = scan.nextLong();
        long l = scan.nextLong();
        if (f-l == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        total--;
        }

    }

}
