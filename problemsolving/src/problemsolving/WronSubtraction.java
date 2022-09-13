
package problemsolving;
import java.util.Scanner;

public class WronSubtraction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int total = scan.nextInt();
        for (int i = 1; i <= total; i++) {
            if ((double) num % 10 == 0) {
                num = num / 10;
            } else {
                num = num - 1;
            }

        }
        System.out.println(num);

    }

}
