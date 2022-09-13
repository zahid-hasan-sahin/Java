package Lab4;

import java.util.Scanner;

public class Two {

    static boolean isValid(String s) {
        boolean laterAndDig = true;
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                laterAndDig = false;
            }
            if (Character.isDigit(s.charAt(i))) {
                ++count;
            }
        }
        if (n >= 8 && laterAndDig && count >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A password: ");
        String s = scan.nextLine();
        if (isValid(s)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
