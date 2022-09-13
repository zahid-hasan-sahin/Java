package problemSolving2;

import java.util.Scanner;

public class EvenSubstrings {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int odd = 0;
        int even = 0;
        int res = 0;
        if (s.charAt(0) % 2 == 0) {
            ++res;
            ++even;
        }   else{
            ++odd;
        }
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)%2==0){
                res += even+1;
                res += odd;
                ++even;
            }else{
                ++odd;
            }
        }
        System.out.println(res);

    }
}
