package problemsolving;
import java.util.Scanner;
public class VasyatheHipster {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int b = scan.nextInt();
        if (r > b) {
            System.out.print(b + " " + ((r - b) / 2));
        } else {
            System.out.print(r + " " + ((b - r) / 2));
        }
        System.out.println();
    }
}
