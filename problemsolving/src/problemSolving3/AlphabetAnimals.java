package problemSolving3;

import java.util.ArrayList;
import java.util.Scanner;

public class AlphabetAnimals {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = scan.nextInt();
        char c = s.charAt(s.length() - 1);
        ArrayList<String> st = new ArrayList<String>();
        int[] a = new int[26];
        for (int i = 0; i < n; i++) {
            String in = scan.next();

            if (in.charAt(0) == c) {
                st.add(in);
                ++a[in.charAt(in.length() - 1) - 'a'];
            }else{
            ++a[in.charAt(0) - 'a'];
            }
        }
        if (st.size() == 0) {
            System.out.println("?");
        } else {
    
            n = st.size();
            for (int i = 0; i < n; i++) {
                if (a[st.get(i).charAt(st.get(i).length() - 1) - 'a'] == 1) {
                    System.out.println(st.get(i) + "!");
                    return;
                }
            }
            System.out.println(st.get(0));
        }
    }
}
