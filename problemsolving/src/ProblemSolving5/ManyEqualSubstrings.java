package ProblemSolving5;

import java.util.Scanner;

public class ManyEqualSubstrings {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder res = new StringBuilder(s);
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                sb.delete(i, i + 1);
                --n;
                --i;
            } else {
                break;
            }
        }
        if (sb.length() == 0) {
            String e = String.valueOf(s.charAt(0));
            for (int i = 0; i < k - 1; i++) {
                res.append(e);
            }
        } else {
            for (int i = 0; i < k - 1; i++) {
                res.append(sb);
            }
        }
        System.out.println(res);
    }
    
}
