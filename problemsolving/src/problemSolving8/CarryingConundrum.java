package problemSolving8;

import java.util.Scanner;

public class CarryingConundrum {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            String odd = "0";
            String even = "0";
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    even += s.charAt(i);;
                } else {
                    odd += s.charAt(i);
                }
            }
            long a = Integer.valueOf(even) + 1;
            long b = Integer.valueOf(odd) + 1;
            System.out.println(a * b - 2);
        }

    }
}
