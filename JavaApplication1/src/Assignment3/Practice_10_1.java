package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice_10_1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the File name:");
        String s = scan.next();
        File f = new File(s);
        Scanner sc = new Scanner(f);
        double mn = Double.MAX_VALUE;
        double mx = Double.MIN_VALUE;
        double sum = 0;
        int c = 0;
        while (sc.hasNext()) {
            double n = sc.nextDouble();
            mn = Math.min(mn, n);
            mx = Math.max(mx, n);
            sum += n;
            ++c;
        }
        System.out.println("Max: " + mx);
        System.out.println("Min: " + mn);
        System.out.println("AVG: " + (sum / c));
    }
}
