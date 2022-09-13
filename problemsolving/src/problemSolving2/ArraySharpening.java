package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySharpening {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> val = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                val.add(scan.nextInt());
            }

            int res = 0;
            boolean ch = false;
            int i = 0;
            for (i = i; i < n; i++) {
                if (val.get(i) < i && !ch) {
                    ch = true;
                    break;
                } else if (!ch) {
                    res++;
                }
            }
            int k = 0;
            --res;
            for (int j = n - 1; j >= i - 1; j--, k++) {
                if (val.get(j) >= k) {
                    ++res;
                } else {
                    break;
                }
            }

            sb.append(res == n ? "YES\n" : "NO\n");
        }
        System.out.println(sb);

    }
}
