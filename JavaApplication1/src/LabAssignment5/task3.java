package LabAssignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class task3 {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment5\\task3_input.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        String s = scan.next();
        Stack<Integer> jackCurr = new Stack<Integer>();
        int totalJack = 0;
        int totalJill = 0;
        FileWriter fw = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment5\\task3_output.txt");
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'J') {
                int pr = a[ind];
                fw.write(String.valueOf(pr));
                jackCurr.add(a[ind]);
                totalJack += a[ind++];

            } else {
                int c = jackCurr.pop();
                int pr = c;
                fw.write(String.valueOf(pr));
                totalJill += c;
            }
        }
        fw.write("\r\n");
        fw.write("Jack will work for " + totalJack + " hours\r\n");
        fw.write("Jill Jill  will work for " + totalJill + " hours\r\n");
        fw.close();
    }
}
