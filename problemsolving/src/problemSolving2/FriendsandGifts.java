package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

  

public class FriendsandGifts {

public static void main(String args[]){
        Scanner  scan =new Scanner(System.in); 
        int n = scan.nextInt();
        ArrayList<Integer> val = new ArrayList<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            val.add(scan.nextInt());
        }
        for (int i = 1; i < val.size() + 1; i++) {
            if (!val.contains(i)) {
                array.add(i);
            }
        }
        for (int i = 0; i < val.size(); i++) {
            if (val.get(i) == 0) {
                if (array.get(array.size() - 1) == i + 1) {
                    sb.append(array.get(0) + " ");
                    array.remove(0);
                } else {
                    sb.append(array.get(array.size() - 1) + " ");
                    array.remove(array.size() - 1);
                }
            } else {
                sb.append(val.get(i) + " ");
            }
        }
        System.out.println(sb);

    }

}
