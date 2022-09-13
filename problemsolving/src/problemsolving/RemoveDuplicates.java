package problemsolving;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> a = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());

        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if(a.get(i)==a.get(j)){
                    
                }
            }
        }

    }

}
