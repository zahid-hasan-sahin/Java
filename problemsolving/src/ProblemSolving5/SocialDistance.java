package ProblemSolving5;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialDistance {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();
            ArrayList<Integer> a = new ArrayList<Integer>();
            int i = 0;
            long res = 0;
            if (s.charAt(i) == '0') {
                int y = s.indexOf("1");
                if (y < 0) {
                    ++res;
                } else if (y > k) {
                    ++res;
                }
                s = "1" + s.substring(1);
            }

            for (i = i; i < n; i++) {
                if (s.charAt(i) == '0') {
                    int p = i;
                    while (i < n && s.charAt(i) == '0') {
                        ++i;
                    }
                    int e = i - p;
                    a.add(e);
                }
            }
            for (int j = 0; j < a.size(); j++) {
                int w = a.get(j) / (k + 1);
                
            }

            System.out.println(res);
        }
    }

}
