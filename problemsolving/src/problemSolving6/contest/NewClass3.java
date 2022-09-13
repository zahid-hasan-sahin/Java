package problemSolving6;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass3 {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int[] a = new int[100000];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (long i = 2; i < 100000; i++) {
            if (a[(int) i] == 0) {
                ar.add((int) i);
                for (long j = i * i; j < 100000; j += i) {
                    a[(int) j] = 1;
                }
            }
        }
        
        int q = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (q-- > 0) {
            int n = scan.nextInt();
            long e = n + 1;
            long res = 1;
            for (int i = 0; i < ar.size(); i++) {
                if (ar.get(i) >= e) {
                    res = ar.get(i);
                    e = ar.get(i);
                    break;
                }
            }
            e += n;
            for (int i = 0; i < ar.size(); i++) {
                if (ar.get(i) >= e) {
                    res *= ar.get(i);
                    break;
                }
            }
            sb.append(res + "\n");
        }
        System.out.println(sb);
    }
}
