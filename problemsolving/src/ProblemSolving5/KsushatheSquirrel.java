package ProblemSolving5;

import java.util.Scanner;

public class KsushatheSquirrel {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String r = scan.next();

        String[] s = r.split("\\.", -1);

        for (int i = 0; i < s.length; i++) {
           
            if (s[i].length() >=k) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
