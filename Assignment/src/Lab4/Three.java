package Lab4;

import java.util.Scanner;

public class Three {

    static void sort(int[] totalHours, int[] id, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (totalHours[j - 1] < totalHours[j]) {
                    int temp1 = totalHours[j - 1];
                    totalHours[j - 1] = totalHours[j];
                    totalHours[j] = temp1;

                    int temp2 = id[j - 1];
                    id[j - 1] = id[j];
                    id[j] = temp2;
                }

            }
        }

    }

    public static void main(String[] args) {

        int n = 5;
        int[][] hours = new int[n][7];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                hours[i][j] = (int) (Math.random() * 12);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(hours[i][j] + " ");
            }
            System.out.println();
        }

        int[] id = new int[n];
        int[] totalHours = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                sum = sum + hours[i][j];
            }
            totalHours[i] = sum;
        }
        sort(totalHours, id, n);
        for (int i = 0; i < n; i++) {
            System.out.println("Employe" + id[i] + " Total working hours is: " + totalHours[i]);
        }
    }
}
