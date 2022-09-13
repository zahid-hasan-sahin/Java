package problemsolving;

import java.util.Scanner;

public class GameWithSticks {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int r = 0;
        if(n>m){
            r = m;
        }else{
            r = n;
        }
        if(r%2==0){
            System.out.println("Malvika");
        }else{
            System.out.println("Akshat");
        }
    }

}
