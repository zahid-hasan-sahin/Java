package DataStructuresAndAlgorithms.Sorting.Gready;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Maximumofallsubarraysofsizek {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        ArrayList<Integer> a = new ArrayList<Integer>();
        Deque<Integer> st = new LinkedList<Integer>();
        for (int i = 0; i < k; i++) {
            while (!st.isEmpty() && arr[st.getLast()] < arr[i]) {
                st.removeLast();
            }
            st.addLast(i);
            while (!st.isEmpty() && st.getFirst() - k > 0) {
                st.removeFirst();
            }
        }
        a.add(arr[st.getFirst()]);
        for (int i = k; i < n; i++) {
            while (!st.isEmpty() && arr[st.getLast()] < arr[i]) {
                st.removeLast();
            }
            st.addLast(i);

            while (!st.isEmpty() && st.getFirst() < i - k) {
                st.removeFirst();
            }

            a.add(arr[st.getFirst()]);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }

    }

}
