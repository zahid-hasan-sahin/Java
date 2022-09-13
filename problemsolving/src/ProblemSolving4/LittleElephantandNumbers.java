package ProblemSolving4;

import java.util.Scanner;

public class LittleElephantandNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = String.valueOf(n);
        int c = 0;
        int[] a = new int[10];
       
        for (int i = 0; i < s.length(); i++) {
            ++a[s.charAt(i) - '0'];
        }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                String k = String.valueOf(i);
                for (int j = 0; j < k.length(); j++) {
                    if (a[k.charAt(j) - '0'] >= 1) {
                        ++c;
                        break;
                    }
                }
                if (n / i != i) {
                    String p = String.valueOf(n / i);
                    for (int j = 0; j < p.length(); j++) {
                        if (a[p.charAt(j) - '0'] >= 1) {
                            ++c;
                            break;
                        }
                    }
                }

            }
        }
        System.out.println(c);
    }

}
