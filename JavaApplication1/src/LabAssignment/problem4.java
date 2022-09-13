package LabAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class problem4 {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment\\input4.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scan.nextInt();
            }
        }
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];

                }
            }
        }
        FileWriter wr = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\LabAssignment\\output4.txt");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                wr.write(C[i][j] + " ");
            }
            wr.write("\r\n");
        }
        wr.close();

    }

}
