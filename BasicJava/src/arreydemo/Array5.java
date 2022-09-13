package arreydemo;

import java.util.Scanner;

public class Array5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        //Gettting Data For A Matrix
        System.out.println("Enter For A Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("\t \t A[%d][%d]= ", row, col);
                A[row][col] = input.nextInt();
            }
        }
        //Getting Data For B Matrix
        System.out.println("Enter For B Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("\t B[%d][%d]= ", row, col);
                B[row][col] = input.nextInt();

            }
        }
        //Printing A Matrix Data
        System.out.print("A=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println();
        }
        System.out.print("\n \n");

        //Printing B Matrix Data
        System.out.print("B=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + B[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        //A+B 
        System.out.print("A+B= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + (A[row][col] + B[row][col]));
            }
            System.out.println();
        }
        System.out.println();
        //A-B 
        System.out.print("A-B= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + (A[row][col] - B[row][col]));
            }
            System.out.println();
        }
        System.out.println();
        //A*B 
        System.out.print("AxB= ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + (A[row][col] * B[row][col]));
            }
            System.out.println();
        }
        System.out.println();

    }

}
