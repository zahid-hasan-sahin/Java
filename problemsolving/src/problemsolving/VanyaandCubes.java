package problemsolving;

import java.util.Scanner;

public class VanyaandCubes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = 0;
        int i = 1;
        int r = 0;
        int c = 0;
        while (n >= r) {
            temp = temp + i;
            i++;
            r = r + temp;
            c++;
        }
        System.out.println(c-1);

    }

}
