package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class KuroniandSimpleStrings {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        ArrayList<Integer> s = new ArrayList<Integer>();
        int r = 0;
        int f =1;
        for (int i = 0; i < n - 1; i++) {
            r = Math.abs(a[i] - a[i + 1]);
            s.add(r);
            f=((f%m)*((a[i]-a[i])%m))%m;
            
        }
    }
}
