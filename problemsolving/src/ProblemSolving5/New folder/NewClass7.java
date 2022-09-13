
import java.util.Scanner;

public class NewClass7 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            long x = scan.nextInt();
            long y = scan.nextInt();
            int n = scan.nextInt();
            long r = y * n + n - 1;
            long k = r / (x - 1)+n;
            System.out.println(r % (x - 1) == 0 ? k : k + 1);

        }

    }

}
