package LabAssignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class task2 {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment5\\task2_input.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] man = new int[m];
        Assignment[] a = new Assignment[n];
        for (int i = 0; i < n; i++) {
            int st = scan.nextInt();
            int en = scan.nextInt();
            a[i] = new Assignment(st, en);
        }
        Arrays.sort(a, new myCom());
        int possible = 0;
        k:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i].start >= man[j]) {
                    man[j] = a[i].end;
                    ++possible;
                    continue k;
                }
            }

        }
        FileWriter fw = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment5\\task2_output.txt");
        fw.write(possible + "\r\n");

        fw.close();
    }
}

class Assignment {

    int start, end;

    Assignment(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class myCom implements Comparator<Assignment> {

    @Override
    public int compare(Assignment a, Assignment b) {
        return a.end - b.end;
    }

}
