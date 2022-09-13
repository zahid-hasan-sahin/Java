package problemSolving2;

import java.util.Scanner;

public class Taymyriscallingyou {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int z = scan.nextInt();
        int res = 0;
        for (int i = 1; i <= z; i++) {
            if(i%n==0 && i%m==0){
                ++res;
            }
        }
        System.out.println(res);

    }
}
