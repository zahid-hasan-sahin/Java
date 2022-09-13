package problemSolving3;

import java.util.Scanner;

public class Godsend {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a =0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if(in%2==1){
                ++a;
            }
        }
        System.out.println(a>0?"First":"Second");
        
    }

}
