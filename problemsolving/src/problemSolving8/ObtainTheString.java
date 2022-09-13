package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class ObtainTheString {

    static int bn(ArrayList<Integer> a, int curr) {
        int l = 0;
        int r = a.size() - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) > curr) {
                r = mid - 1;
                res = mid;
            } else {
                l = mid + 1;
            }

        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {

            String a = scan.next();
            String b = scan.next();
            int n = a.length();
            ArrayList<Integer>[] f = new ArrayList[26];
            for (int i = 0; i < 26; i++) {
                f[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < n; i++) {
                f[a.charAt(i) - 'a'].add(i + 1);
            }
            for (int i = 0; i < b.length(); i++) {
                if (f[b.charAt(i) - 'a'].size() == 0) {
                    System.out.println("-1");
                    continue k;
                }
            }
            int curr = 0;
            int res = 0;
            for (int i = 0; i < b.length(); i++) {
                int p = bn(f[b.charAt(i) - 'a'], curr);
                if (p == -1) {
                    ++res;
                    curr = 0;
                    p = bn(f[b.charAt(i) - 'a'], curr);
                }

                curr = f[b.charAt(i) - 'a'].get(p);

            }

            System.out.println(res + 1);
        }
    }
}
