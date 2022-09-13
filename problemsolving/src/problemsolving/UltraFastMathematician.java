
package problemsolving;

import java.util.Scanner;

public class UltraFastMathematician {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        String result = "";
        int check = 0;
        int t = s1.length();
        while (t > 0) {
            if (s1.charAt(check) == s2.charAt(check)) {
                result = result + "0";

            } else {
                result = result + "1";

            }

            t--;
            check++;

        }
        System.out.println(result);
    }
}
