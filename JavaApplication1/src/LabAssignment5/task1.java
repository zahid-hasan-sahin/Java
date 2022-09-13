package LabAssignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class task1 {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment5\\task1_input.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        Assignment[] a = new Assignment[n];
        for (int i = 0; i < n; i++) {
            int st = scan.nextInt();
            int en = scan.nextInt();
            a[i] = new Assignment(st, en);
        }
        Arrays.sort(a, new myCom());
        ArrayList<Assignment> res = new ArrayList<Assignment>();
        int freeAt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i].start >= freeAt) {
                freeAt = a[i].end;
                res.add(a[i]);
            }
        }
        FileWriter fw = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment5\\task1_output.txt");
        fw.write(res.size() + "\r\n");
        for (int i = 0; i < res.size(); i++) {
            fw.write(res.get(i).start + " " + res.get(i).end + "\r\n");
        }
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
