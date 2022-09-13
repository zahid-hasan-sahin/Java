package NumberTheory;

import java.util.Scanner;

public class phiphiphi {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] st = new int[1000001];
        for (int i = 0; i < 1000001; i++) {
            st[i] = i;
        }
        for (int i = 2; i < 1000001; i++) {
            if (st[i] == i) {
                for (int j = i; j < 1000001; j += i) {
                    st[j] = st[j] / i;
                    st[j] = st[j] * (i - 1);
                }
            }
        }
        //  System.out.println(st[80]);
        while (t-- > 0) {
            System.out.println(st[scan.nextInt()]);

        }
    }

}
