package problemSolving2;

import java.util.Scanner;

public class MahmoudandLongestUncommonSubsequence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        if (!a.equalsIgnoreCase(b)) {
            System.out.println(a.length() > b.length() ? a.length() : b.length());
        } else {
            System.out.println(-1);

        }
    }

}
