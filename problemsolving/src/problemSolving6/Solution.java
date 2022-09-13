package problemSolving6;

import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Solution {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double k = (a - 2 * Math.PI * b) / (2 * Math.PI);
            double area = (b + k) * (b + k) * Math.PI;
            double ar = k * k * Math.PI;
            double p = (area - ar);

            System.out.format("%.4f", p);
            System.out.println();

        }
    }
    
}
