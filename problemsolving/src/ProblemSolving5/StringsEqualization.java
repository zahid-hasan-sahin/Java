package ProblemSolving5;

import java.util.Scanner;

public class StringsEqualization {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        a:  while (t-- > 0) {
            String a = scan.next();
            String b = scan.next();
            int n = a.length();
            int[] k = new int[26];
            for (int i = 0; i < n; i++) {
                ++k[a.charAt(i) - 'a'];
            }
            for (int i = 0; i < n; i++) {
                if(k[b.charAt(i)-'a']>=1){
                    System.out.println("Yes");
                    continue a;
                }
            }
            System.out.println("No");
        }
    }

}
