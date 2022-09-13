package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FightwithMonsters {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int k = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        ArrayList<Integer> v = new ArrayList<Integer>();
        int p = a + b;
        int res = 0;
        for (int i = 0; i < n; i++) {

            int in = scan.nextInt();
            v.add(in % p > 0 ? in % p : b+a);

        }
     Collections.sort(v);
        for (int i = 0; i < v.size(); i++) {
            if(v.get(i)/(double)a<=1){
                ++res;
            }else{
                if(k-(v.get(i)/a)>=0){
                    ++res;
                    k   -=(v.get(i)/a);
                }else if(v.get(i)-a<=k){
                    ++res;
                    k=v.get(i)-a;
                }
            }
        }
        System.out.println(res);

    }

}
