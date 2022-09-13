package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class BoyorGirl {

    public static void main(String arrgs[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] temp = s.toCharArray();
        int count = 1;
        Arrays.sort(temp);
        for (int i = 0; i < s.length() - 1; i++) {
            if (temp[i] != temp[i + 1]) {
                count++;
            }

        }
        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }

}
