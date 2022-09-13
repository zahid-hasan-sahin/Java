package problemSolving3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TeaQueue {

    public class queue {

        int in, out;
        int index;

        public void add(int i, int o, int indx) {
            in = i;
            out = o;
            index = indx;
        }
    }

    public class myCom implements Comparator<queue> {

        @Override
        public int compare(queue ar1, queue ar2) {
            int f = ar1.in;
            int l = ar2.in;
            return f >= l ? 1 : -1;
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            TeaQueue.queue pos[] = new TeaQueue.queue[n];
            TeaQueue ob = new TeaQueue();
            for (int i = 0; i < n; i++) {
                pos[i] = ob.new queue();
            }
            for (int i = 0; i < n; i++) {
                int inq = scan.nextInt();
                int dq = scan.nextInt();
                pos[i].add(inq, dq, i);
            }

            int spendTime = 0;
            int[] res = new int[n];
            Arrays.sort(pos, ob.new myCom());
            for (int i = 0; i < n; i++) {
                int temp = spendTime;
                if (spendTime < pos[i].out) {
                    spendTime = Math.max(++spendTime, pos[i].in);
                }
                if (temp == spendTime) {
                    res[pos[i].index] = 0;
                } else {
                    res[pos[i].index] = spendTime;

                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

        }             

    }

}
