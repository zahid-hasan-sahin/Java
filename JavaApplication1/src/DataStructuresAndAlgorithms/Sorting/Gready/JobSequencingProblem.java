package DataStructuresAndAlgorithms.Sorting.Gready;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JobSequencingProblem {

    static class Job {

        int id, d, p;

        Job(int id, int d, int p) {
            this.id = id;
            this.d = d;
            this.p = p;
        }
    }

    static class myCom implements Comparator<Job> {

        @Override
        public int compare(Job l, Job r) {
            int p = l.p;
            int q = r.p;
            if (p == q) {
                return l.d - r.d;
            } else {
                return q - p;
            }
        }

    }

    static int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, new myCom());
        int c = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (c < arr[i].d) {
                ++c;
                s += arr[i].p;
            }
        }
        int[] k = {c, s};
        return k;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Job[] ob = new Job[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new Job(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        int[] a = JobScheduling(ob, n);
        System.out.println(a[0] + " " + a[1]);
    }

}
