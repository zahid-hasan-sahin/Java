
package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < total; i++) {
            array.add(scan.nextInt());
        }
        Collections.sort(array);
        int res = array.size()%2==1?array.size()/2:(array.size()/2)-1;
        System.out.println(array.get(res));       
    }
    
}
