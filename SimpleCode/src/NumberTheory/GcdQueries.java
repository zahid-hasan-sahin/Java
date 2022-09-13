package NumberTheory;

import java.util.Scanner;

public class GcdQueries {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
                
        int t = scan.nextInt();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] pre = new int[n + 2];
            int[] post = new int[n + 2];
            int temp = 0;
            pre[0] = post[0] = pre[n + 1] = post[n + 1] = 0;
            for (int i = 1; i <= n; i++) {
                temp = gcd(temp, a[i - 1]);
                pre[i] = temp;

            }

            temp = 0;
            for (int i = n; i > 0; --i) {
                temp = gcd(a[i - 1], temp);
                post[i] = temp;

            }

            while (q-- > 0) {
                int l = scan.nextInt();
                int r = scan.nextInt();
                System.out.println(gcd(pre[l - 1], post[r + 1]));
            }
        }

    }

}
