package FinalExamTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bangladesh {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("bangdata.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        double sum = 0;
        double sqSum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sqSum += (arr[i] * arr[i]);
        }
        double mean = sum / n;
        double variant = (sqSum / n) - (mean * mean);
        double standardDeviation = Math.sqrt(variant);
        System.out.println("Mean=" + mean);
        System.out.println("Variant=" + variant);
        System.out.printf("Standard deviation=%.3f\n", standardDeviation);

    }
}
