package problemsolving;

import java.util.Scanner;

public class BeautifulYear {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int k = 0;
        while (k == 0) {
            year = year + 1;

            String s = String.valueOf(year);
            if (s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2) && s.charAt(0) != s.charAt(3) && s.charAt(1) != s.charAt(2) && s.charAt(1) != s.charAt(3) && s.charAt(2) != s.charAt(3)) {
                k++;
            }
        }
        System.out.println(year);

    }

}
