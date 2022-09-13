package problemsolving;
import java.util.Scanner;

public class DoubleCola {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int st = 5;
        int def = 5;
        int fst = 0;
        while (st < n) {
            fst = st;
            def *= 2;
            st = def + st;
        }

        int same = def / 5;
        if (((n-1 - fst) / same) == 0) {
            System.out.println("Sheldon");
        } else if (((n-1 - fst) / same) == 1) {
             System.out.println("Leonard");
        } else if (((n-1 - fst) / same) == 2) {
             System.out.println("Penny");
        } else if (((n-1 - fst) / same) == 3) {
             System.out.println("Rajesh");
        } else if (((n-1 - fst) / same) == 4) {
             System.out.println("Howard");
        }
    }

}
