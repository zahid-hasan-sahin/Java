package problemSolving8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class cfContest724 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int d = 0;
            int k = 0;
            int r = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'D') {
                    ++d;
                } else {
                    ++k;
                }
                if (k % 2 == 0 && d % 2 == 0) {
                    
                }
            }
        }
    }
}
