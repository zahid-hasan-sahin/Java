package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass7 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = 0;
            int sum = 0;
            int p = 0;
            int temp = Integer.MAX_VALUE;
            int z = 0;
            ArrayList<Integer> v = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                v.add(scan.nextInt());
                if (v.get(i) > 0) {
                    p += v.get(i);
                } else if(v.get(i)>0){
                    m += v.get(i);
                }else{
                    ++z;
                }
                sum += v.get(i);
                if (temp > v.get(i)) {
                    temp = v.get(i);
                }
            }
       

        }

    }

}
