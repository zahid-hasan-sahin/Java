package javaapplication1;

import java.util.Scanner;

public class PrimeSubtraction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double f = scan.nextDouble();
        double l = scan.nextDouble();
        double test = f - l;
        int c = 0;
        String s = String.valueOf(test);
        for (int i = 2; i <= (int) test/2; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    String p = String.valueOf(i);
                    if (test % i == 0) {
                        c++;
                        break;
                    } else if (s.contains(p)) {
                        c++;
                        break;
                    }

                }
                if(c>0){
                    break;
                }

            }

        }
        if (c > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
