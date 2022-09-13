package Mid;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = scan.nextLine();
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
