package Lab3;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.print("Enter " + n + " scores: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int best = 0;
        for (int i = 0; i < n; i++) {
            best = Math.max(best, a[i]);
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >= best - 10) {
                System.out.println("Student " + i + " score is " + a[i] + " and grade is A");
            } else if (a[i] >= best - 20) {
                System.out.println("Student " + i + " score is " + a[i] + " and grade is B");
            } else if (a[i] >= best - 30) {
                System.out.println("Student " + i + " score is " + a[i] + " and grade is C");
            } else if (a[i] >= best - 40) {
                System.out.println("Student " + i + " score is " + a[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + a[i] + " and grade is F");
            }
        }
    }
}
