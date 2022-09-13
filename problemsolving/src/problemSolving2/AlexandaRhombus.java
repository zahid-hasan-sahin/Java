
package problemSolving2;

import java.util.Scanner;

public class AlexandaRhombus {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 1;
        for (int i = 0; i <n; i++) {
            res +=(4*i);
        }
        System.out.println(res);
        
        
    }
}
