package Lab3;

import java.util.Scanner;

public class Six {

    static void sort(String[] name, int[] score, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (score[j - 1] < score[j]) {
                    int tempS = score[j - 1];
                    score[j - 1] = score[j];
                    score[j] = tempS;

                    String tempN = name[j - 1];
                    name[j - 1] = name[j];
                    name[j] = tempN;
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numberes of students: ");
        int n = scan.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + i + ": ");
            name[i] = scan.next();
            System.out.print("Enter grade of student " + i + ": ");
            score[i] = scan.nextInt();
        }
        sort(name, score, n);
        System.out.println("student names in decreasing order of their scores: ");
        for (int i = 0; i < n; i++) {
            System.out.print(name[i] + " ");
        }

    }
}
