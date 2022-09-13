package problemSolving8;

import java.util.Scanner;

public class cfContest1658 {
    
    public static boolean isSet(int n, int k) {
        ++k;
        if ((n & (1 << (k - 1))) > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    static long set(long n, int k) {
        return ((1 << k) | n);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] temp = new int[n];
            temp[0] = (n + 1) - a[0];
            int k = n - 1;
            for (int i = 1; i < n; i++) {
                temp[i] = (n + 1) - a[k--];
                
            }
            for (int i = 0; i < n; i++) {
                System.out.print(temp[i]+" ");
            }
            int[] fre = new int[n + 10];
            for (int i = 0; i < n; i++) {
                fre[temp[i]]++;
            }
            for (int i = 0; i < n; i++) {
                if (fre[i] > i) {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");
        }
    }
    
}
