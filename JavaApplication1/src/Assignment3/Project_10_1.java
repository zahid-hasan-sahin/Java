package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Project_10_1 {

    public static void main(String[] args) throws IOException, FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Input File name: ");
        String a = scan.next();
        System.out.print("Enter output File name: ");
        String b = scan.next();
        File x = new File(a);
        File y = new File(b);
        Scanner inp = new Scanner(x);
        FileWriter out = new FileWriter(y);

        while (inp.hasNext()) {
            String s = inp.nextLine();
            String res = String.valueOf(s.charAt(0)).toUpperCase();
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    while (i < s.length() && s.charAt(i) == ' ') {
                        ++i;
                    }
                    res += " ";
                    --i;
                } else {
                    res += s.charAt(i);
                }

            }
            
            out.write(res + "\n");
        }
        out.close();

    }
}
