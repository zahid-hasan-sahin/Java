
package Task;

public class FourA {

    static void printPattern(int n, int space) {
        if (space == -1) {
            return;
        }
        for (int i = 1; i <= n - space; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        printPattern(n, space - 1);

    }

    public static void main(String args[]) {
        int n = 5;
        printPattern(n, n - 1);
    }

}
