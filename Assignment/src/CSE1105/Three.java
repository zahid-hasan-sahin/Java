package CSE1105;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Three {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        File f = new File("student.txt");
        FileWriter wr = new FileWriter(f);
        int n = 30;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student id:");
            int id = scan.nextInt();
            System.out.print("Enter  MID1,MID2 and final marks of " + (id) + " student:");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            wr.write(id + " " + a + " " + b + " " + c + "\n");
        }
        wr.close();
        Scanner sc = new Scanner(f);
        int m1 = 0;
        int m2 = 0;
        int fi = 0;
        int m1id = 0;
        int m2id = 0;
        int fiid = 0;
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (m1 < a) {
                m1 = a;
                m1id = id;
            }
            if (m2 < b) {
                m2 = b;
                m2id = b;
            }
            if (fi < c) {
                fi = c;
                fiid = id;
            }

        }
        System.out.println("Mid1 highest mark student id: " + m1id);
        System.out.println("Mid2 highest mark student id: " + m2id);
        System.out.println("Final highest mark student id: " + fiid);
    }
}
