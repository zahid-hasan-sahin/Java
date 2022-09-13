package problemsolving;

import java.util.Scanner;

public class ThreeFriends {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int sum =Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
            System.out.println(sum-4>0?sum-4:0);
            
        }

    }

}
