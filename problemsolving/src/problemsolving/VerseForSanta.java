package problemsolving;

import java.util.Scanner;

public class VerseForSanta {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] val = new int[n];
            int total = 0;
            int last = 0;
            int big = 0;
            int bigpos = 0;
            boolean b = true;
            for (int i = 0; i < n; i++) {
                val[i] = scan.nextInt();
                if (total + val[i] <= k && b) {
                    total = total + val[i];
                    last = i;
                    if (big < val[i]) {
                        big = val[i];
                        bigpos = i;
                    }
                }else{
                    b = false;
                }
                if(val[bigpos]==val[i]){
                    bigpos = i;
                    last = i;
                }

            }
            System.out.println(total+" "+last+" "+big+" "+bigpos);

            try{
            System.out.println(val[bigpos]>val[last+1] ?bigpos+1:0);
            }catch(Exception c){
               System.out.println(0);
            }

        }
        System.out.println(sb);

    }

}
