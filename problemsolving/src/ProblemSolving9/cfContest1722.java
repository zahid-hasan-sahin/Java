
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class cfContest1722 {

    public static boolean isset(int n,
            int k) {
        k += 1;
        if ((n & (1 << (k - 1))) > 0) {
            return true;
        } else {
            return false;
        }
    }

    static int set(int n, int k) {

        return ((1 << k) | n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> odd = new ArrayList<Integer>();
            ArrayList<Integer> even = new ArrayList<Integer>();

            int o = 0;
            int e = 0;

            for (int i = 1; i <= n / 2 - 1; i++) {

                odd.add(i);
                o ^= i;
            }
            for (int i = n / 2 + 1; i < n; i++) {
                even.add(i);
                e ^= i;
            }

      
                e ^= o;
          

            int r = set(0, 29);
            for (int i = 0; i <= 28; i++) {
                if (isset(e, i)) {
                    r = set(r, i);
                }
            }
            odd.add(set(0, 29));
            even.add(r);
         

            int[] res = new int[n];
            int l = 0;
            r = 0;
            boolean ch = true;
            for (int i = 0; i < n; i++) {
                if (ch) {
                    res[i] = even.get(r++);
                    ch = !ch;
                } else {
                    res[i] = odd.get(l++);
                    ch = !ch;
                }
            }

            for (int i = 0; i < n; i++) {
                sb.append(res[i] + " ");

            }
            int x = 0;
            int y = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    x ^= res[i];
                } else {
                    y ^= res[i];
                }
            }
            
          
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
