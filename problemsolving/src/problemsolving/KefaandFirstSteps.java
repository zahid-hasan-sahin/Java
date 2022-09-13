package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KefaandFirstSteps {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] n = new int[t];
        for (int i = 0; i < t; i++) {
            n[i] = scan.nextInt();
        }
        ArrayList<Integer> array = new ArrayList<Integer>();
        int c = 0, u = 0;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] <= n[i + 1]) {
                c++;
                array.add(c);
            } else {
                c = 0;
            }

        }
        Collections.sort(array);
        if(array.size()==0){
            System.out.println("1");
        }else{
         System.out.println(array.get(array.size() - 1) + 1);
        }
    }
}
