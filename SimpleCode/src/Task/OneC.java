package Task;

public class OneC {

    static void printElements(int[] a, int ind) {
        if (ind == a.length) {
            return;
        }
        System.out.print(a[ind] + " ");
        printElements(a, ind + 1);
    }

    public static void main(String args[]) {
        int[] a = {10, 20, 30, 40, 50};
        printElements(a, 0);
    }

}
