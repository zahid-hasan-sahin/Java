
import java.util.Arrays;
import java.util.Scanner;

public class NewClass1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = {11, 111, 1111, 11111, 111111, 1111111, 11111111, 111111111, 1111111111, 1111111111};
            for (int i = 9; i >= 0; i--) {
                while (n >= a[i]) {
                    for (int j = 0; j < 10; j++) {
                        if (n % a[j] == 0) {
                            System.out.println("YES");
                            continue k;
                        }
                    }
                    n -= a[i];
                    String k = String.valueOf(n);
                    
                //    System.out.println(a[i]+" "+n);
                    if (k.charAt(k.length() - 1) == '9') {
                        System.out.println(k);
                        System.out.println("YES");
                        continue k;
                    }
                }
            }
            System.out.println(n);
            if (n == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
