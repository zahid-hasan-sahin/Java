package problemSolving8;

import java.util.Scanner;
import java.util.TreeSet;

public class ReverseSort {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int l = 0;
            int r = n - 1;
            boolean b = false;
            TreeSet<Integer> a = new TreeSet<Integer>();
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i + 1) < s.charAt(i)) {
                    b = true;
                }
            }
            if (!b) {
                System.out.println("0");
                continue;
            }
            int c = 0;
            int p = 0;
            while (l <= r) {
                
                if (s.charAt(l) == '1') {
                    int e = a.size();
                    a.add(l);
                    if (a.size() != e) {
                        ++c;
                    }
                }
                if (s.charAt(r) == '0') {
                    int e = a.size();
                    a.add(r);
                    if (a.size() != e) {
                        ++p;
                    }
                }
             
                if (c < p) {
                    ++l;
                } else if (p < c) {
                    --r;
                } else {
                    ++l;
                    --r;
                }

            }
            System.out.println(1);

            System.out.print(a.size() + " ");
            for (int i : a) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }

    }

}
