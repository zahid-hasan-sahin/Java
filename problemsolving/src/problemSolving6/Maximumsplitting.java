package problemSolving6;
import java.util.Scanner;
 
public class Maximumsplitting {
 
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = n / 4;
            if (n <= 3) {
                System.out.println("-1");
            } else if (k < 2) {
                if (n % 4 == 0 || n % 4 == 2) {
                    System.out.println("1");
                } else {
                    System.out.println("-1");
                }
            } else {
                if (n % 4 == 0) {
                    System.out.println(k);
                } else if (n % 4 == 1) {
                    System.out.println(Math.max(1, k - 1));
                } else if (n % 4 == 2) {
                    System.out.println(k);
                } else {
                    if (k - 2 == 0) {
                        System.out.println("-1");
                    } else {
                        if (n >= 15) {
                            System.out.println(k - 1);
                        } else {
                            System.out.println(k - 2);
                        }
                    }
                }
            }
        }
 
    }
 
}