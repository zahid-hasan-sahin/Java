package problemSolving2;

import java.util.Scanner;

public class NewClass6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int sum = 0;
            int odd = 0;
            int even = 0;
            int p = 0;
            for (int i = 0; i < n; i++) {
                int k =scan.nextInt();
                if(k%2==1){
                    ++odd;
                }else{
                    ++even;
                }
            }
            if((odd>0 && even>0) || odd%2==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
                      
        }

    }

}
