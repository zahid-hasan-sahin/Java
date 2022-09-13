package MultiDimensionalArrays;

import java.util.Scanner;

public class GradingMultipleChoiceTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Numbers of students: ");
        int n = scan.nextInt();
        System.out.print("Number of Questions: ");
        int m = scan.nextInt();
        char[][] ans = new char[n][m];
        char[] key = new char[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = (char) ((Math.random() * 26) + 'A');
                ans[i][j] = c;
            }
        }
        for (int i = 0; i < m; i++) {
            char c = (char) ((Math.random() * 26) + 'A');
            key[i] = c;
        }
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < m; j++) {
                if (ans[i][j] == key[j]) {
                    ++c;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + c);
        }
    }
}
