package problemSolving8;

import java.util.Scanner;

public class cfContest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.charAt(j)-'0';
                }
            }
            int c1 = 0;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    
                    if (a[i][j] == 1) {
                        ++count;
                    }
                }
           
                if (count == 0) {
                    c1 += 1;
                } else {
                    c1 += count - 1;
                }
              //  System.out.println(count);

            }

            int c2 = 0;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j][i] == 1) {
                        ++count;
                    }
                }
                if (count == 0) {
                    c2 += 1;
                } else {
                    c2 += count - 1;
                }

            }
            System.out.println(Math.max(c1, c2));
        }
    }
}
