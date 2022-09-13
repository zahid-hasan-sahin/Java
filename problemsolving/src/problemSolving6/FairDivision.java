package problemSolving6;

import java.util.Scanner;

public class FairDivision {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            long s = 0;
            int k = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                s += a[i];
                if (a[i] % 2 == 1) {
                    ++k;
                }
            }
            if (s % 2 == 0) {
                s = s/2;
                if(s%2==0 || k!=0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
    }

}
