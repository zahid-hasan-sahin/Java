package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static String u(String s, char c, int i) {
        return s.substring(0, i) + c + s.substring(i + 1);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
                b.add(scan.nextInt());
            }

            String s = scan.next();

            int k = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    s = u(s, '0', i);
                    ++k;
                } else if (s.charAt(i) == 'B') {
                    s = u(s, '1', i);
                    ++k;
                } else if (s.charAt(i) == 'C') {
                    s = u(s, '2', i);
                    ++k;
                } else if (s.charAt(i) == 'D') {
                    s = u(s, '3', i);
                    ++k;
                } else if (s.charAt(i) == 'E') {
                    s = u(s, '4', i);
                    ++k;
                }

            }
           

            long res = 0;
            k:
            while (true) {
                System.out.println(s);
                int u = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                        ++u;
                    }
                }
                if (u <= 1) {
                    break;
                }

                for (int i = 0; i < s.length() - 1; i++) {

                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                        int l = s.charAt(i) - '0';
                        int r = s.charAt(i + 1) - '0';
                        a.add(a.get(l));
                        b.add(b.get(r));
                        res += a.get(l) * b.get(r) * b.get(l);
                        s = s.substring(0, i) + String.valueOf(k++) + s.substring(i + 2);

                        int w = i + 1;
                        while (w < s.length() && s.charAt(w) == ')') {
                            ++w;
                        }

                        s = s.substring(0, i + 1) + s.substring(w);
                        w = i - 1;
                        while (w >= 0 && s.charAt(w) == '(') {
                            --w;
                        }
                        ++w;
                        s = s.substring(0, w) + s.substring(i);
                        continue k;
                    }
                    

                }

            }
            System.out.print("Case " + q++ + ": ");
            System.out.println(res);
        }
    }
}
