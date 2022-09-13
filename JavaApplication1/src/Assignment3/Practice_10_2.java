package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Practice_10_2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Input File name: ");
        String a = scan.next();
        System.out.print("Enter output File name: ");
        String b = scan.next();
        File x = new File(a);
        File y = new File(b);
        Scanner inp = new Scanner(x);
        FileWriter out = new FileWriter(y);

        TreeSet<Integer> t = new TreeSet<Integer>();
        while (inp.hasNext()) {
            int in = inp.nextInt();
            t.add(in);
        }
        for (int i : t) {
            out.write(i+"\n");
        }
        out.close();
    }
}
