
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
// WRITE YOUR CODE HERE
        Scanner abc = new Scanner(System.in);
        int n = abc.nextInt();
        char[][] a = new char[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                char s = abc.next().charAt(0);
                a[i][j] = s;

            }
        }

        boolean ch = true;
        int alice = 0;
        int bob = 0;
        int b = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 'S') {
                    ++s;
                }
                if (a[i][j] == 'B') {
                    ++b;
                }

                if (b >= 3) {
                    if (s < 3) {
                        if (ch) {
                            alice += b;
                            ch = !ch;

                        } else {
                            bob += b;
                            ch = !ch;
                            //  System.out.println(i+" "+b+" "+s);

                        }
                        b = 0;
                        s = 0;
                    } else {

                        b = 0;
                        s = 0;
                        ch = !ch;
                    }
                }
            }
        }
   
        if (b >= 1) {
            if (s < 3) {
                if (ch) {
                    alice += b;
                    ch = !ch;

                } else {
                    bob += b;
                    ch = !ch;
                }
            }

        }
        System.out.println("Alice " + alice + ",Bob " + bob);
    }
}
