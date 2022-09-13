package problemsolving;

import java.util.Scanner;

public class Heating {

    static void printSubsets(int set[]) {
        int n = set.length;
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{ ");
            int m = 1; 
            for (int j = 0; j < n; j++) {
                if ((i & m) > 0) {
                    System.out.print(set[j] + " ");
                }
                m = m << 1;
            }

            System.out.println("}");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int c = scan.nextInt();
            int k = scan.nextInt();
            int temp = 0;
            int[] subset = new int[k*c+c];
            for (int i = 0; i <=k; i++) {
                for (int j = 0; j <c; j++) {
                    subset[temp] = j;
                    ++temp;
                }
            }
            for(int o:subset){
                System.out.print(o+" ");
            }
    System.out.println();
        }

    }

}
