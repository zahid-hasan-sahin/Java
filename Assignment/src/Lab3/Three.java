package Lab3;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String s = scan.next();
        int l = 0;
        int r = s.length() - 1;
        boolean isPal = true;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                isPal = false;
                break;
            }
            ++l;
            --r;
        }
        if (isPal) {
            System.out.println(s + " is A palindrome");
        } else {
            System.out.println(s + " is't A palindrome");
        }
    }
}
