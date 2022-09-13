
package problemsolving;


import java.util.Scanner;

public class Hulk {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        String s = "";
        for (int i = 1; i <= total; i++) {
            if (i % 2 != 0) {
                if (i == 1) {
                    s = s + "I hate";
                } else {
                    s = s + " that I hate";
                }

            } else {
                s = s + " that I love";
            }

        }

        System.out.println(s + " it");

    }

}
