package ProblemSolving7;

import java.util.Scanner;
import java.util.Stack;

public class NewClass8 {

    static boolean isValid(int i, int j, int n, int[][] a, int k) {

        if (i - 1 > 0 && a[i - 1][j] == k) {
            return false;
        }

        if (j - 1 > 0 && a[i][j - 1] == k) {
            return false;
        }

        if (i + 1 <= n && a[i + 1][j] == k) {
            return false;
        }

        if (j + 1 <= n && a[i][j + 1] == k) {
            return false;
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Stack<Integer> wx = new Stack< Integer>();
        Stack<Integer> wy = new Stack< Integer>();
        Stack<Integer> bx = new Stack< Integer>();
        Stack<Integer> by = new Stack< Integer>();
        boolean b = true;
        for (int i = 1; i <= n; i++) {
            boolean ch = b;
            for (int j = 1; j <= n; j++) {
                if (b) {
                    wx.add(i);
                    wy.add(j);
                    b = !b;
                } else {
                    bx.add(i);
                    by.add(j);
                    b = !b;
                }

            }
            b = !ch;

        }
        int k = n * n;
        while (k-- > 0) {
            int x = scan.nextInt();
            if (x == 1) {
                if (!bx.isEmpty()) {
                    System.out.println(2 + " " + bx.pop() + " " + by.pop());
                } else {
                    System.out.println(3 + " " + wx.pop() + " " + wy.pop());
                }
            } else if (x == 2) {
                if (!wx.isEmpty()) {
                    System.out.println(1 + " " + wx.pop() + " " + wy.pop());
                } else {
                    System.out.println(3 + " " + bx.pop() + " " + by.pop());
                }
            } else {
                if (!wx.isEmpty()) {
                    System.out.println(1 + " " + wx.pop() + " " + wy.pop());
                } else {
                    System.out.println(2 + " " + bx.pop() + " " + by.pop());
                }
            }
        }
    }
}
