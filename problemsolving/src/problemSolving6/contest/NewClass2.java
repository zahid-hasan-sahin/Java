
import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] b = new int[n];
            for (int i = 1; i < n - 1; i++) {
                if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                    System.out.println(a[i]+" b "+i);
                    if (b[i - 1] == 0 && b[i] == 0 && b[i + 1] == 0) {
                        b[i] = 1;
                    }
                }
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    System.out.println(a[i]+" "+i);
                    if (b[i - 1] == 0 && b[i] == 0 && b[i + 1] == 0) {
                        b[i] = 1;
                    }
                }
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
              //  System.out.println(i + " " + b[i]);
                res += b[i];
            }
            System.out.println(Math.max(res - 1, 0));
        }

    }

}
