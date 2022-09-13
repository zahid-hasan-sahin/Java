package problemsolving;

import java.util.Scanner;

public class RestoringPassword {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String zero = scan.next();
        String one = scan.next();
        String two = scan.next();
        String three = scan.next();
        String four = scan.next();
        String five = scan.next();
        String six = scan.next();
        String seven = scan.next();
        String eight = scan.next();
        String nine = scan.next();
        String res = "";
        for (int i = 0; i < 80; i += 10) {
            if (s.substring(i, i + 10).equals(zero)) {
                res = res + "0";
            }
            if (s.substring(i, i + 10).equals(one)) {
                res = res + "1";
            }
            if (s.substring(i, i + 10).equals(two)) {
                res = res + "2";
            }
            if (s.substring(i, i + 10).equals(three)) {
                res = res + "3";
            }
            if (s.substring(i, i + 10).equals(four)) {
                res = res + "4";
            }
            if (s.substring(i, i + 10).equals(five)) {
                res = res + "5";
            }
            if (s.substring(i, i + 10).equals(six)) {
                res = res + "6";
            }
            if (s.substring(i, i + 10).equals(seven)) {
                res = res + "7";
            }
            if (s.substring(i, i + 10).equals(eight)) {
                res = res + "8";
            }
            if (s.substring(i, i + 10).equals(nine)) {
                res = res + "9";
            }
  

        }
        System.out.println(res);

    }
}
