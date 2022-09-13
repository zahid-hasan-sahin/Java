package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class tast1 {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File file = new File("input.txt");
        Scanner scan = new Scanner(file);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer>[] node = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            node[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            node[u].add(v);
        }
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "    ");
            for (int j = 0; j < node[i].size(); j++) {
                System.out.print(node[i].get(j) + "    ");
            }
            System.out.println();
        }
    }
}
