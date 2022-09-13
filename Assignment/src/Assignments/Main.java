package Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("text-1.txt");
        Scanner scan = new Scanner(f);
        Manager[] arr = new Manager[5];
        while (scan.hasNext()) {
            String s = scan.nextLine();
            String[] in = s.split(";");
            Manager ob = new Manager();
            ob.cName = in[0];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].toString());
        }

    }
}
