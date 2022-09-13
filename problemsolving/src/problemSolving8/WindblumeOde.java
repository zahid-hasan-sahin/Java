package problemSolving8;

import java.util.Scanner;

public class WindblumeOde {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] f = new int[20010];
        for (int i = 2; i < 20010; i++) {
            if (f[i] == 0) {
                for (int j = i+i; j < 20010; j += i) {
               
                    f[j] = 1;
                }
            }
        }
        
       
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                sum += a[i];
            }
            if (f[sum] == 1) {
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print(i + 1+" ");
                }
                System.out.println();
            } else {
                System.out.println(n - 1);
                for (int i = 0; i < n; i++) {
                    if (f[sum - a[i]] == 1) {
                        for (int j = 0; j < n; j++) {
                            if (i == j) {
                                continue;
                            }
                            System.out.print(j + 1+" ");

                        }
                        System.out.println();
                        continue k;
                    }
                }
            }
        }

    }

}
