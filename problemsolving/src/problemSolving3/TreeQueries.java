package problemSolving3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class TreeQueries {

    int bn(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return bn(arr, l, mid - 1, x);
            }

            return bn(arr, mid + 1, r, x);
        }

        return -1;
    }

    class Graph {

        int r;
        int n;
        LinkedList<Integer> next = new LinkedList<Integer>();
        LinkedList<Integer> back = new LinkedList<Integer>();

        void nextEel(int n) {
            next.add(n);
        }
    }

    public void addVertix(Graph[] tree, int n) {
        for (int i = 0; i <= n; i++) {
            tree[tree[i].r].next.add(tree[i].n);
            tree[tree[i].n].back.add(tree[i].r);
        }

    }

    public class myCom implements Comparator<Graph> {

        @Override
        public int compare(Graph ob1, Graph ob2) {
            return ob1.n > ob2.n ? 1 : -1;
        }
    }

    public class rev implements Comparator<Graph> {

        @Override
        public int compare(Graph ob1, Graph ob2) {
            return ob1.n > ob2.n ? 1 : -1;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        TreeQueries tr = new TreeQueries();
        TreeQueries.Graph ob[] = new TreeQueries.Graph[n + 1];
        for (int i = 0; i <= n; i++) {
            ob[i] = tr.new Graph();
        }
        for (int i = 0; i < n - 1; i++) {
            int in1 = scan.nextInt();
            int in2 = scan.nextInt();
            if (in1 > in2) {
                ob[i].r = in2;
                ob[i].n = in1;
            } else {
                ob[i].r = in1;
                ob[i].n = in2;
            }
        }
        Arrays.sort(ob, tr.new myCom());
        tr.addVertix(ob, n);
        for (int i = 0; i <= n; i++) {
            System.out.println(ob[i].next);
        }
        System.out.println("Back: ");
        for (int i = 0; i <= n; i++) {
            System.out.println(ob[i].back);
        }
        while (m-- > 0) {
            int k = scan.nextInt();
            int[] arra = new int[k + 1];
            arra[0] = 1;
            for (int i = 1; i <= k; i++) {
                arra[i] = scan.nextInt();
            }
            Arrays.sort(arra); 
            System.out.println("Wait:");
            for (int i = k; i > 0; i--) {
                System.out.println(arra[i]+" "+arra[i-1]);
                System.out.println(Collections.binarySearch(ob[arra[i]].back,arra[i-1]));
            }

        }

    }

}
