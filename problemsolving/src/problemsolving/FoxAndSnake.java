package problemsolving;

import java.util.Scanner;

public class FoxAndSnake {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String full = "";
        String last = "";
        String first = "#";
        for (int i = 0; i < m; i++) {
            full += "#";
            if (i != 0) {
                first += ".";
            }
            if (i != m-1) {
                last += ".";

            }

        }
        last +="#";
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 1) {
                System.out.println(full);
            }else{
                if(i%4==0){
                    System.out.println(first);
                }else{
                    System.out.println(last);
                }
            }
        }
    }
}
