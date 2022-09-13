package problemSolving3;

import java.util.Scanner;

public class PINCodes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] arra = new int[100000];
            String[] val = new String[n];
            for (int i = 0; i < n; i++) {
                String in = scan.next();
                val[i] = in;

                ++arra[Integer.valueOf(in)];

            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                if ((Integer.valueOf(val[i]) + arra[Integer.valueOf(val[i])]) / 10 != Integer.valueOf(val[i]) / 10 && arra[Integer.valueOf(val[i])] > 1) {

                    ++c;
                    int j = Integer.valueOf(val[i]);
                    if (arra[Integer.valueOf(val[i])] >= 10) {
                        int temp = i;
                        arra[Integer.valueOf(val[i])]--;
                        String s = String.valueOf(Integer.valueOf(val[temp]) + 10);
                        while (s.length() != 4) {
                            s = "0" + s;
                        }
                        val[temp] = s;
                        continue;

                    }

                    while (arra[j] != 0) {
                        --j;
                    }
                    arra[Integer.valueOf(val[i])]--;
                    String s = String.valueOf(j);
                    if (s.length() < 4) {
                        while (s.length() != 4) {
                            s = "0" + s;
                        }
                    }
                    val[i] = s;
                    ++arra[j];

                } else if (arra[Integer.valueOf(val[i])] > 1) {
                    ++c;
                    int j = Integer.valueOf(val[i]);
                    while (arra[j] != 0) {
                        ++j;
                    }
                    arra[Integer.valueOf(val[i])]--;
                    String s = String.valueOf(j);
                    if (s.length() < 4) {
                        while (s.length() != 4) {
                            s = "0" + s;
                        }
                    }
                    val[i] = s;
                    ++arra[j];
                }
            }
            System.out.println(c);
            for (int i = 0; i < n; i++) {
                System.out.println(val[i]);
            }
        }
    }

}
