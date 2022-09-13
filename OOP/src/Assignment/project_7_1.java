package Assignment;

import java.util.Scanner;

public class project_7_1 {

    static int toInt(char a) {
        return a - 'a';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the string: ");
            String s = scan.nextLine().toLowerCase();
            int[] a = new int[26];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    ++a[toInt(s.charAt(i))];
                }
            }
            for (int i = 0; i < 26; i++) {
                System.out.println((char) (i + 'a') + " " + a[i]);
            }
            System.out.println("Do you want to exist? Y/N");
            String in = scan.next().toLowerCase();
            if (!in.equals("y")) {
                break;
            }
            scan.nextLine();
        }
    }
}
