package problemSolving6;

import java.util.Scanner;

public class MakeAllOdd {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int o = 0;
            int e = 0;
            for (int i = 0; i < n; i++) {
                if (scan.nextInt() % 2 == 1) {
                    ++o;
                } else {
                    ++e;
                }
            }
            if(o==0){
                System.out.println("-1");
            }else{
                System.out.println(e);
            }
        }
    }

}
