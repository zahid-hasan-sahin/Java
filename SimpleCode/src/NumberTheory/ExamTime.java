package NumberTheory;

import java.util.Scanner;

public class ExamTime {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] ph = new int[1000010];
        for (int i = 0; i < 1000010; i++) {
            ph[i] = i;
        }
        for (int i = 2; i < 1000010; i++) {
            if (ph[i] == i) {
                for (int j = i; j < 1000010; j += i) {
                    ph[j] = ph[j] / i;
                    ph[j] = ph[j] * (i - 1);
                }
            }
        }
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(ph[n]);
        }

    }

}
