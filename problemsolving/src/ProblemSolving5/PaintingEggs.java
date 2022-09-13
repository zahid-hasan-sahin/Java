package ProblemSolving5;

import java.util.Scanner;

public class PaintingEggs {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        long a = 0;
        long g = 0;
        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();
            int l = scan.nextInt();
        
            if (a + k <= g + 500) {
                sb.append("A");
                a += k;
            } else {
                sb.append("G");
                g += l;
            }
        }
        System.out.println(sb);
    }

}
