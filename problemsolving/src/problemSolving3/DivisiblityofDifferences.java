package problemSolving3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DivisiblityofDifferences {

    public class div {

        int n, mod;
    }

    public class myCom implements Comparator<div> {

        @Override
        public int compare(div ob1, div ob2) {
            return ob1.mod > ob2.mod ? 1 : -1;
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        DivisiblityofDifferences d = new DivisiblityofDifferences();
        DivisiblityofDifferences.div[] ob = new DivisiblityofDifferences.div[n];
        for (int i = 0; i < n; i++) {
            ob[i] = d.new div();
            int in = scan.nextInt();
            ob[i].n = in;
            ob[i].mod = in % k;
        }
        Arrays.sort(ob, d.new myCom());
        int res[] = new int[n];
        int[] temp = new int[k];
        int c = 0;
        for (int i = 0; i < n; i++) {
            temp[ob[i].mod]++;
        }
        int mx = -1;
        int u = -1;
        for (int i = 0; i < k; i++) {
            if (temp[i] > u) {
                mx = i;
                u = temp[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (ob[i].mod == mx) {
                res[c] = ob[i].n;
                ++c;
            }
            if (c > m) {
                break;
            }
        }
        if (c >= m) {
            System.out.println("Yes");
            for (int i = 0; i < m; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No");
        }
    }

}
