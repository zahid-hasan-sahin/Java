package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialNetwork {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> m = new ArrayList<Integer>();
        int val[] = new int[100000000];
        int val2[] = new int[100];
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if (val[t+1] == 0) {
                m.add(0, t);
                val[t+1]++;
                if (m.size() > k) {
                    val[m.get(m.size()-1)+1]=0;
                    m.remove(m.size() - 1);
                }
            }

        }
        System.out.println(m.size());
        for (int i = 0; i < m.size(); i++) {
            System.out.print(m.get(i) + " ");
        }
        System.out.println();

    }

}
