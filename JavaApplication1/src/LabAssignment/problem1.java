package LabAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class problem1 {

    static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment\\input.txt");
        Scanner scan = new Scanner(f);
        ArrayList<String> st = new ArrayList<String>();
        ArrayList<Double> num = new ArrayList<Double>();
        while (scan.hasNext()) {
            num.add(scan.nextDouble());
            st.add(scan.next());
        }
        FileWriter wr = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment\\output.txt");
        int odd = 0;
        int even = 0;
        int non = 0;
        int palin = 0;
        int nonPalin = 0;
        for (int i = 0; i < st.size(); i++) {
            double n = num.get(i);
            if (n != (int) n) {
                wr.write(n + " cannot have parity and ");
                ++non;
            } else {
                if (n % 2 == 0) {
                    wr.write((int) n + " has even parity and ");
                    ++even;
                } else {
                    wr.write((int) n + " has odd parity and ");
                    ++odd;
                }
            }
            String s = st.get(i);
            boolean ch = isPalindrome(s);
            if (ch) {
                wr.write(s + " is a palindrome\r\n");
                ++palin;
            } else {
                wr.write(s + " is not a palindrome\r\n");
                ++nonPalin;
            }

        }
        wr.close();
        FileWriter rec = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment\\record.txt");
        double tot = (odd + even + non);
        rec.write("Percentage of odd parity: " + (100 * odd / tot) + "%\r\n");
        rec.write("Percentage of even  parity: " + (100 * even / tot) + "%\r\n");
        rec.write("Percentage of non parity: " + (100 * non / tot) + "%\r\n");
        tot = (palin + nonPalin);
        rec.write("Percentage of palindrome: " + (100 * palin / tot) + "%\r\n");
        rec.write("Percentage of non-palindrome palindrome: " + (100 * nonPalin / tot) + "\r\n");
        rec.close();
    }

}
