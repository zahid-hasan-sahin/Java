package Lab3;

import java.util.Scanner;

public class Four {

    static boolean Isdistinct(int[] a, int n, int key) {
        boolean isDis = true;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                isDis = false;
                break;
            }
        }
        return isDis;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int ind = 0;
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int in = scan.nextInt();
            if (Isdistinct(a, ind, in)) {
                a[ind] = in;
                ++ind;
            }
        }
        System.out.println("the number of distinct numbers is: "+ind);
        System.out.println("The distinct numbers are:");
        for (int i = 0; i < ind; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
