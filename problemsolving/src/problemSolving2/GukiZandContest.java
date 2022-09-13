
package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GukiZandContest {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> rating = new ArrayList<Integer>();
        ArrayList<Integer> sortRating = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            rating.add(scan.nextInt());
        }
        sortRating.addAll(rating);
        Collections.sort(sortRating,Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.print(sortRating.indexOf(rating.get(i))+1+" ");
        }
        System.out.println();
        
    }
}
