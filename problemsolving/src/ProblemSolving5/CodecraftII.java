package ProblemSolving5;

import java.util.Scanner;

public class CodecraftII {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] a = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String s = scan.next();
        int k = scan.nextInt();
        int p = 0;
        for (int i = 0; i < 12; i++) {
            if (a[i].equals(s)) {
                p = i;
                break;
            }
        }
        System.out.println(a[(p + k) % 12]);
    }

}
