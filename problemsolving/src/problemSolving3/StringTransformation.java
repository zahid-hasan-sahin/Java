package problemSolving3;

import java.util.Scanner;

public class StringTransformation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(scan.next());
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) ('a' + i);
        }

        int j = 0;
        int n = sb.length();
        int i = 0;
        for ( i =i ; i < n; i++) {

            if(alpha[j]>=sb.charAt(i)){
                sb.replace(i,i+1, String.valueOf(alpha[j]));
                ++j;
                if(j==26){
                    break;
                }
            }
            
        }
        if (j == 26) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }

    }

}
