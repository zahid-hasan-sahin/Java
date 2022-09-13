package problemSolving8;
import java.util.Arrays;
import java.util.Scanner;
 
public class PolycarpandSumsofSubsequences {
 
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = 7;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[0] + " " + a[1] + " " + (a[6] - a[0] - a[1]));
        }
    }
 
}