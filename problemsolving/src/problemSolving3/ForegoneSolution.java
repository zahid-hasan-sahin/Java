package problemSolving3;

import java.util.Scanner;

public class ForegoneSolution {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int p = 0;
        while (t-- > 0) {
            ++p;
            String s = scan.next();
            String a = "";
            String b = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '7') {

                    a += "6";
                    b += s.charAt(i) - '6';
                } else {
                    int q = (s.charAt(i) - '0') / 2;
                    a += String.valueOf(q);
                    b += String.valueOf((s.charAt(i) - '0') - q);
                }
            }
            System.out.println("Case #" + p + ": " + a + " " + b);
        }

    }

}
