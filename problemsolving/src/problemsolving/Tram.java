package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tram {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int stops = scan.nextInt();
        int[] in = new int[stops];
        int[] out = new int[stops];
        for (int i = 0; i < stops; i++) {
            in[i] = scan.nextInt();
            out[i] = scan.nextInt();
            
        }
        ArrayList<Integer> array = new ArrayList<Integer>();
        int capacity = 0;
        for (int i = 0; i < stops; i++) {
            capacity = (capacity - in[i]) + out[i];
            array.add(capacity);
            
        }
        Collections.sort(array);
        System.out.println(array.get(array.size()-1));
    }
    
}
