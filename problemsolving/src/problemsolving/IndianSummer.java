package problemsolving;

import java.util.HashSet;
import java.util.Scanner;

public class IndianSummer {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> colorOfTreeAndLeavs = new HashSet<String>();
        int n = scan.nextInt();
        scan.nextLine();
        while (n-- > 0) {
            colorOfTreeAndLeavs.add(scan.nextLine());
        }
        System.out.println(colorOfTreeAndLeavs.size());
    }
}
