package javaapplication1;

import java.util.Scanner;

public class NewClass13 {

    static public void m(int n) {
        if (n == 0) {
            return;
        }
        m(n - 1);
        
    }

    public static void main(String args[]) {
        NewClass13 n = new NewClass13();
        m(10);
    }
}
