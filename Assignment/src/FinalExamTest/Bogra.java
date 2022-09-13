package FinalExamTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bogra {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("bogdata.txt");
        Scanner scan = new Scanner(f);
        String s = scan.next();
        String[] arr = s.split(",");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int in = Integer.valueOf(arr[i]);
            if (in % 2 == 1) {
                sum += in;
            }
        }
        FileWriter wr = new FileWriter(new File("bogout.txt"));
        wr.write("Summation of all odd numbers is " + sum);
        wr.close();
    }
}
