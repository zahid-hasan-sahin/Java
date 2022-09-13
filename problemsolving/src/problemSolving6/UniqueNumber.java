package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String st = "";
            for (int i = 9; i >= 1; i--) {
                st += i;
                int k = 0;
                for (int j = 0; j < st.length(); j++) {
                    k += st.charAt(j) - '0';
                }
                if (k == n) {
                    break;
                } else if (k > n) {
                    st = st.substring(0, st.length() - 1);
                }
            }
            int k = 0;
            for (int i = 0; i < st.length(); i++) {
                k += st.charAt(i) - '0';
            }
            if (k == n) {
                char[] a = st.toCharArray();
                Arrays.sort(a);
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i]);
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }

}
