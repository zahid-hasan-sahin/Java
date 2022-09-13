package Assignment;

import java.util.Scanner;

public class project_7_2 {
    
    public static boolean isPalindrome(char[] a, int used) {
        char[] temp = new char[a.length];
        int last = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[last];
            --last;
        }
        for (int i = 0; i < a.length; i++) {
            if (temp[i] != a[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                ++n;
            }
        }
        int k = 0;
        char[] c = new char[n];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                c[k] = s.charAt(i);
                ++k;
            }
        }
        System.out.println(isPalindrome(c, 0));
    }
}
