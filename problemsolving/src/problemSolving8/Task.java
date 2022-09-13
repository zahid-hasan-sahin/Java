package problemSolving8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Task {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f = new File("C:\\Users\\zahid\\Desktop\\task\\task3_input.txt");
        FileWriter out = new FileWriter("C:\\Users\\zahid\\Desktop\\task\\task3_output.txt");

        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        int[] chore = new int[n];
        for (int i = 0; i < n; i++) {
            chore[i] = scan.nextInt();
        }
        String s = scan.next();
        Arrays.sort(chore);
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(new CustomSort());
        ArrayList<Integer> res = new ArrayList<Integer>();
        int jillHours = 0;
        int jackHours = 0;
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'J') {
                res.add(chore[ind]);
                q.add(chore[ind]);
                jackHours += chore[ind++];
            } else {
                int curr = q.poll();
                res.add(curr);
                jillHours += curr;
            }
        }
        for (int i = 0; i < res.size(); i++) {
            out.write(res.get(i)+"");
        }
        out.write("\r\n");
        out.write("Jack will work for " + jackHours + " hours\r\n");
        out.write("Jill will work for " + jillHours + " hours");
        out.close();
    }
}

class CustomSort implements Comparator<Integer> {

    @Override
    public int compare(Integer x, Integer y) {
        if (x == y) {
            return 0;
        } else if (x > y) {
            return -1;
        } else {
            return 1;
        }
    }

}
