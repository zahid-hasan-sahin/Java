package ProblemSolving4;

import java.util.Scanner;

public class divBy4141 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int a1 = scan.nextInt();
            int c = scan.nextInt();
            int n = scan.nextInt();
            String s = "";
            if (n == 1) {
                s = String.valueOf(a);
            } else {
                s = String.valueOf(a) + String.valueOf(a1);
            }
            for (int i = 2; i < n; i++) {
                s += String.valueOf(((a1) * c + (a)) % 10);
                System.out.println(s);
                if (s.length() > 2) {
                    a = s.charAt(s.length() - 2) - '0';
                    a1 = s.charAt(s.length() - 1) - '0';
                    
                } else {
                    a = s.charAt(0);
                    a1 = s.charAt(1);
                }
                s = String.valueOf(Integer.valueOf(s) % 41);
            }
            if (Integer.valueOf(s) % 41 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
