package problemsolving;

import java.util.Scanner;

public class RepeatingCipher {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        String s = scan.next();
        String res = "";
        int i = 0;
        int j = 1;
        while (i<= total - 1) {
            res = res + s.charAt(i);
            i = j+i;           
            j++;
            
        }
        System.out.println(res);

    }

}
