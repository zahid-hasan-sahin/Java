
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NewClass6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        q:
        while (t-- > 0) {
            int n = scan.nextInt();
            int mx = -1;
            ArrayList<Integer> a = new ArrayList<Integer>();
            int[] b = new int[1010];
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }

            Collections.sort(a, Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                
            }
        }

    }
}
