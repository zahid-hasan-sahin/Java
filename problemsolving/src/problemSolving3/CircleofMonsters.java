package problemSolving3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CircleofMonsters {

  
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        
        try {
            int t = Integer.parseInt(br.readLine());
            StringBuffer sb = new StringBuffer();
            while(t-->0) {
                int n = Integer.parseInt(br.readLine());
                long[] a = new long[n];
                long[] b = new long[n];
                for(int i=0 ; i<n ; i++) {
                    st = new StringTokenizer(br.readLine());
                    a[i] = Long.parseLong(st.nextToken());
                    b[i] = Long.parseLong(st.nextToken());
                }
                a[n] = a[0];
                b[n] = b[0];
                long sum = 0;
                long min = Long.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    sum += Math.max(0, a[i + 1] - b[i]);
                    min = Math.min(min, Math.min(a[i + 1], b[i]));
                }
                sb.append(sum + min + "\n");

            }

            System.out.println(sb);

        } finally {

        }
    }
}
