package problemSolving3;

import java.util.Scanner;

public class And {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] contain = new int[100000];
        int[] arra = new int[100000];
        for (int i = 0; i < n; i++) {
            arra[i] = scan.nextInt();
        }
        int[] conAnd = new int[100000];
        for (int i = 0; i < n; i++) {
            contain[arra[i]]++;
            conAnd[arra[i] & m]++;
        }
        int mx = -1;
        for (int i = 0; i < n; i++) {
            if (contain[(arra[i] & m)] != 0 && (arra[i] & m) != arra[i]) {
                if (mx >= 2) {
                    mx = 0;
                } else {
                    mx = 1;
                }
                break;
            } else if (conAnd[(arra[i] & m)] != 0 && (arra[i] & m) != arra[i]) {
                if (conAnd[(arra[i] & m)] >= 2) {
                    mx = 0;
                } else {
                    mx = 2;
                }
            }
        }
        System.out.println(mx);

    }

}
