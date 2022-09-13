package DataStructuresAndAlgorithms.Sorting.Algo;

public class stack {

    int top = 0;
    int arra[] = new int[100];
    int min = Integer.MAX_VALUE;

    void add(int d) {
        if (top == 0) {
            arra[top++] = d;
            min = d;
        } else {
            if (d < min) {
                arra[top++] = ( d - min);
                min = d;
            } else {
                arra[top++] = d;
            }
        }
    }

    int get() {
        if (arra[--top] < min) {
            int t = min;
            min = min - arra[top];
            return t;
        } else {
            return arra[top];
        }
    }

    boolean isEmpty() {
        if (top <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String argsg[]) {
        stack n = new stack();
        n.add(56);
        n.add(5);
        n.add(34);
        System.out.println(n.get());
        System.out.println(n.get());
        System.out.println(n.isEmpty());
        System.out.println(n.get());
        System.out.println(n.isEmpty());
    }
}
